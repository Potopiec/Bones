package dev.raf.dao;

import dev.raf.dao.dto.FossilDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
class DbFacade implements IDbFacade {
    Connection connection;

    @Autowired
    public DbFacade(IDbConnection connector) {
        this.connection = connector.getConnection();
    }

    @Override
    public void save(FossilDto fossil) {
        String stat = "INSERT INTO Collection (type,period,name,location,state) value(?,?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(stat);
            statement.setString(1,fossil.getType().toString());
            statement.setString(2,fossil.getPeriod().toString());
            statement.setString(3,fossil.getName());
            statement.setString(4,fossil.getLocation());
            statement.setString(5,fossil.getState());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String stat = "DELETE from Collection where id= ?";
        try {
            PreparedStatement statement = connection.prepareStatement(stat);
            statement.setInt(1,id);
            int cos = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(FossilDto fossilQueryDto){
        String state = "UPDATE Collection SET type=?, period=?, name=?, location=?, state=?" +
                " where id = ? ";

        try {
            PreparedStatement statement = connection.prepareStatement(state);
            statement.setString(1, fossilQueryDto.getType());
            statement.setString(2, fossilQueryDto.getPeriod());
            statement.setString(3, fossilQueryDto.getName());
            statement.setString(4, fossilQueryDto.getLocation());
            statement.setString(5, fossilQueryDto.getState());
            statement.setInt(6, fossilQueryDto.getId());

            int cos = statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
