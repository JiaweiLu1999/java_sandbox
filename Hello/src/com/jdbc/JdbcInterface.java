package com.jdbc;

public interface JdbcInterface {
    Object getConnection();
    void crud();
    void close();
}
