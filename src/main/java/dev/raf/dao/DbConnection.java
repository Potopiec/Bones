package dev.raf.dao;

import dev.raf.domain.FossilEntyty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class DbConnection implements IDbConnection {


    private IDbConnection connection;
    private Data data;


    @Autowired
    DbConnection() {
        data = new Data();

    }


    @Override
    public List<FossilEntyty> getFossilList() {
        return data.fossilEntityList;
    }
}
