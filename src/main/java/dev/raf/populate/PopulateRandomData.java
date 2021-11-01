package dev.raf.populate;

import java.sql.*;
import java.util.Random;

class PopulateRandomData {


     private static void main(String[] args) {
         String type[] = {"BODY","CARBON","MOLECULAR","PSEUDO","TRACE","UNKNOWNTYPE"};


         String period []={"CENOZOIC","MESSOSOIC","PALEOZOIC","UNKNOWNPERIOD"};


         String state []= {"exelent","acceptable","fractured"};

         try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bones","root","toor");
            Statement statement = connection.createStatement();


            for (int i=0;i <=100 ;i++){
                String sql = "insert into collection"
                        +" (type, period, name,location,state)"
                        + " values( '"+random(type)+"', '"+random(period)+"', 'name"+i+"','location"+i+"','"+random(state)+"')";

                statement.executeUpdate(sql);
                System.out.println("go"+i);
            }




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String random(String [] s){
        int nr = new Random().nextInt(s.length);
        return s[nr];
    }
}
