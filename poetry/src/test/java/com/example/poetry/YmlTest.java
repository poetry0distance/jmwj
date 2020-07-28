package com.example.poetry;

import com.example.poetry.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2020/5/21
 * Time: 13:46
 *
 * @author false
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class YmlTest {
    @Autowired
    private User user;
    @Test
    public void c(){
        System.out.println(user);
    }
}
