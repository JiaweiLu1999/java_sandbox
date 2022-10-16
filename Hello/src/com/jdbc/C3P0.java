package com.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class C3P0 {

    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("./src/com/jdbc/mysql.properties"));
        String url = (String) properties.get("url");
        String usr = (String) properties.get("user");
        String pwd = (String) properties.get("password");

        ComboPooledDataSource ds = new ComboPooledDataSource();



    }
}
