package dev.raf.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.sql.*;



@Component
@PropertySource("classpath:main.properties")
class DbConnection implements IDbConnection{

    private Connection connection;

    DbConnection(@Value("${connection.driver}")String driverPath,@Value("${connection.user}")String user,@Value("${connection.password}")String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    driverPath,
                    user,
                    password);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Connection getConnection(){
        return this.connection;
    }




}
