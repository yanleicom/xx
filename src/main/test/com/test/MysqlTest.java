package com.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlTest {

    @Test
    public void method() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?characterEncoding=utf-8","root","root");
            System.out.println(connection);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
