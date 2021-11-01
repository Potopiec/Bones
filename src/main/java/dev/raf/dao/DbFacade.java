package dev.raf.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class DbFacade implements IDbFacade {
    Connection connection;

    @Autowired
    public DbFacade(IDbConnection connector) {
        this.connection = connector.getConnection();
    }

}
