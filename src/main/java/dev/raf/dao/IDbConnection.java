package dev.raf.dao;

import java.sql.Connection;


interface IDbConnection {
    Connection getConnection();
}
