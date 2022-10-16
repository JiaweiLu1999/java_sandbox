package com.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javafx.beans.property.adapter.JavaBeanBooleanProperty;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class Druid {
    @Test
    public void testDruid() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("./src/com/jdbc/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));




    }
}
