package com.jdbc;





import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {


    }

    @Test
    public void connect01() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> cls = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) cls.newInstance();

        String url = "jdbc:mysql://localhost:3306/jae_test";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "ljw13511579112");
        Connection connect = driver.connect(url, properties);

        String sql = "insert into t06 values (4, 'male', 'liu')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);

        System.out.println(rows > 0 ? "Success" : "Failed.");

        statement.close();
        connect.close();
    }

    @Test
    public void connect02() throws SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/com/jdbc/mysql.properties"));
        String url = (String) properties.get("url");
        String usr = (String) properties.get("user");
        String pwd = (String) properties.get("password");

        Connection connect = DriverManager.getConnection(url, usr, pwd);


        String sql = "insert into t06 values (7, 'male', 'lu')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);

        System.out.println(rows > 0 ? "Success" : "Failed.");

        statement.close();
        connect.close();
    }

    @Test
    public void connect03() throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/com/jdbc/mysql.properties"));
        String url = (String) properties.get("url");
        String usr = (String) properties.get("user");
        String pwd = (String) properties.get("password");

        Connection connection = DriverManager.getConnection(url, usr, pwd);
        String sql = "select * from t06";
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String sex = resultSet.getString(2);
            String name = resultSet.getString(3);
            System.out.println(id + " " + sex + " " + name);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }


}
