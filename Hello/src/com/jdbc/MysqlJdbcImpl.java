package com.jdbc;

public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("Connected!");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("CRUD...");
    }

    @Override
    public void close() {
        System.out.println("Closed.");
    }
}
