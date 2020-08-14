package com.util;

import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * User: wangtao
 * Date: 2020/8/3
 *
 * @author false
 * Description:
 */
public class DirverMngUtil {

    @Transactional(rollbackFor = Exception.class)
    public void driMng() throws SQLException {
        Connection connection = DriverManager.getConnection("data/source");

        String catalog = connection.getCatalog();
        int holdability = connection.getHoldability();
    }
}
