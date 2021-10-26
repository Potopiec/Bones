package dev.raf.dao;

import dev.raf.domain.FossilEntyty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbFacade {
    private IDbConnection connection;

    @Autowired
    public DbFacade(IDbConnection connection) {
        this.connection = connection;
    }


    public List<FossilEntyty> getData(){
        return connection.getFossilList();
    }

}
