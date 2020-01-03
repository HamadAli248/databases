package com.company.idea.BringingBackData;

import java.sql.*;

public class BringingBackData {

    public void data(String args[]) {

        Connection c = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/practing",
                            "hamad", "password");
            System.out.println("Opened database successfully");


            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM car where condition new");
            System.out.println(rs);
            while (rs.next()) {

                System.out.print(rs.getString(1));
                System.out.print(" : ");
                System.out.println(rs.getInt(2));
                System.out.print(" : ");
                System.out.println(rs.getString(3));
       }

    } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
