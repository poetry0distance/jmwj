import cn.hutool.core.collection.CollUtil;
import com.util.MapSysUtil;
import javafx.scene.input.DataFormat;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static cn.hutool.extra.spring.SpringUtil.getBean;

/**
 * User: wangtao
 * Date: 2020/8/4
 *
 * @author false
 * Description:
 */
public class MainTest {
    private static Map<String,Object> catchMap = new HashMap<>(2);
    private static Map<String,Object> cm = new ConcurrentHashMap<>();
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        MapSysUtil sysUtil = new MapSysUtil();
        String  s = sysUtil.getClass().getName();
        String pn = "SysString";
        Class c = Class.forName(s);
        Object obj = c.newInstance();
        Method m = obj.getClass().getDeclaredMethod(pn,String.class);
        m.invoke(obj,"sss");

//        Class[] classes = {A.class,B.class};
//        for (Class aclass:classes){
//            getBean(aclass);
//        }
//        System.out.println(getBean(B.class).getA() == getBean(A.class));
//        System.out.println(getBean(A.class).getB() == getBean(B.class));
    }

    @SneakyThrows
    private static <T> T getBean(Class<T> beanClass){
        String beanName = beanClass.getSimpleName().toLowerCase();
        if (catchMap.containsKey(beanName)){
            return (T) catchMap.get(beanName);
        }

        //将对象本身实例化
        Object object = beanClass.getDeclaredConstructor().newInstance();

        catchMap.put(beanName,object);
        //把所有字段当成需要注入的bean 创建并注入到当前bean
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field:fields){
            //确保通过反射可以访问该字段 private属性
            field.setAccessible(true);
            //获取需要注入字段的class
            Class<?> fieldClass = field.getType();
            String fieldBeanName = fieldClass.getSimpleName().toLowerCase();
            field.set(object,catchMap.containsKey(fieldBeanName)?catchMap.get(fieldBeanName):getBean(fieldClass));

        }
        return (T) object;
    }
}
