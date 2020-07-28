package com.example.poetry.service.imp;

import com.example.poetry.service.DistanceService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2018/12/24
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class DistanceServiceImp implements DistanceService {
    private final Log logger = LogFactory.getLog(DistanceServiceImp.class);

    static final String propsClassPath = "C:\\\\Users\\\\Administrator\\\\Desktop\\\\data.properties";
    static final String propsPath = "data.properties";


    @Override
    public String findId(String name){
        Properties properties = new Properties();
        InputStream propsFile;
        try {
            propsFile = new FileInputStream(propsPath);
            properties.load(new InputStreamReader(propsFile,"utf-8"));
            propsFile.close();
        } catch (FileNotFoundException e) {
            try {
                propsFile = this.getClass().getClassLoader()
                        .getResourceAsStream(propsClassPath);
                properties.load(propsFile);
                propsFile.close();
            } catch (IOException ioe) {
                logger.error(propsClassPath + " has exception!", ioe);
            }
        } catch (IOException e) {
            logger.error(propsClassPath + " has exception!", e);
        }

        String s = properties.getProperty(name);
        return s;
    }
}
