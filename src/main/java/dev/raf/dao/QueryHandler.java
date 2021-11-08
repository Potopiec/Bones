package dev.raf.dao;

import dev.raf.dao.dto.FossilDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
class QueryHandler implements IQueryHandler {
    private Connection connection;

    @Autowired
    public QueryHandler(IDbConnection connection) {
        this.connection = connection.getConnection();

    }

    @Override
    public List<FossilDto> getAllEntries() {
        PreparedStatement statement;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement("select * from collection");
            resultSet = statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return populateArray(resultSet);
    }


    private List<FossilDto> populateArray(ResultSet resultSet) {
        List<FossilDto> list = new ArrayList<>();
        if (resultSet != null) {

            try {

                while (resultSet.next()) {
                    list.add(new FossilDto(resultSet.getInt("id"), resultSet.getString("type"), resultSet.getString("period"), resultSet.getString("name")
                            , resultSet.getString("location"), resultSet.getString("state")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;

    }

    @Override
    public List<FossilDto> getAllEntriesSortedBy(String header) {
        PreparedStatement statement = null;
        try {
            switch (header) {
                case "type":
                    statement = connection.prepareStatement("select * from collection order by type");
                    break;
                case "period":
                    statement = connection.prepareStatement("select * from collection order by period");
                    break;
                case "name":
                    statement = connection.prepareStatement("select * from collection order by name");
                    break;
                case "location":
                    statement = connection.prepareStatement("select * from collection order by location");
                    break;
                case "state":
                    statement = connection.prepareStatement("select * from collection order by state");
                    break;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return populateArray(getSortedResultSetBy(statement));
    }


    @Override
    public FossilDto getElementById(int id) {
        String stat = "SELECT * from Collection where id = ?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(stat);
            statement.setInt(1, id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entityBuilder(statement);
    }

    private FossilDto entityBuilder(PreparedStatement statement) {
        FossilDto queryDto = null;

        try{
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()) {
        queryDto = new FossilDto(resultSet.getInt("id"), resultSet.getString("type"),
                resultSet.getString("period"), resultSet.getString("name"),
                resultSet.getString("location"), resultSet.getString("state"));
        }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return queryDto;

    }


    private ResultSet getSortedResultSetBy(PreparedStatement statement){

        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }




}
