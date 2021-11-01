package dev.raf.dao;

import dev.raf.dao.dto.FossilQueryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class QueryHandler implements IQueryHandler{
    private Connection connection;

    @Autowired
    public QueryHandler(IDbConnection connection) {
        this.connection = connection.getConnection();

    }

    @Override
    public List<FossilQueryDto> getAllEntries(){
        PreparedStatement statement;
        ResultSet resultSet= null;
        try {
            statement = connection.prepareStatement("select * from collection");
            resultSet = statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return populateArray(resultSet);
    }


    private  List<FossilQueryDto> populateArray(ResultSet resultSet){
        List<FossilQueryDto> list = new ArrayList<>();
        if (resultSet != null) {

            try {

                while (resultSet.next()) {
                    list.add(new FossilQueryDto(resultSet.getInt("id"), resultSet.getString("type"), resultSet.getString("period"), resultSet.getString("name")
                            , resultSet.getString("location"), resultSet.getString("state")));
                }} catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;

    }

    @Override
    public List<FossilQueryDto> getAllEntriesSortedBy(String header){
        PreparedStatement statement = null;
        try {
            switch (header){
                case  "type":
                    statement = connection.prepareStatement("select * from collection order by type");
                        break;
                case  "period":
                    statement = connection.prepareStatement("select * from collection order by period");
                    break;
                case  "name":
                    statement = connection.prepareStatement("select * from collection order by name");
                    break;
                case  "location":
                    statement = connection.prepareStatement("select * from collection order by location");
                    break;
                case  "state":
                    statement = connection.prepareStatement("select * from collection order by state");
                    break;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return populateArray(getSortedResultSetby(statement));
    }


    private ResultSet getSortedResultSetby(PreparedStatement statement){

        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }


}
