package com.company.idea.CheckingCar;

import java.sql.*;

public class CheckingCar {

    public static void selectedCar(String args[]) {


        Connection c;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/practing",
                            "hamad", "password");
            System.out.println("Opened database successfully");

            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM car where model = 'mondeo' and price = '20000'");

            if (rs.next()) {
                System.out.println("Yor car is mondeo and the price is 20000");
            } else{
                System.out.println("No car found");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }}


