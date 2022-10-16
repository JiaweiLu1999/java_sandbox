package com.dao.test;

import com.dao.dao.T06DAO;
import com.dao.domain.People;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestDAO {
    @Test
    public void test01() {
        T06DAO t06DAO = new T06DAO();

        List<People> list = t06DAO.queryMulti("select * from t06 where id >= ?", People.class, 1);
        System.out.println("Result: ");
        for (People p : list) {
            System.out.println(p);
        }
    }
}
