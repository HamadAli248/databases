package com.company.idea.AddingACar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("/")
public class AddingCar  extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws ServletException, IOException{


        String carModel = request.getParameter("Model");
        String carPrice = request.getParameter("Price");
        String carCondition = request.getParameter("Condition");

        PrintWriter writer = response.getWriter();

        String htmlResponse = "/" ;
        htmlResponse += "<h2>Your Car Model is: " + carModel + "<br/>";
        htmlResponse += "<h2>Your Car Price is: " + carPrice + "<br/>";
        htmlResponse += "Your Car Condition: " + carCondition + "</h2>";
        htmlResponse += "</html>";

        writer.println(htmlResponse);
    }

    public static void main(String[] args) {
    Connection c = null;

        try {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/practing",
                        "hamad", "password");
        System.out.println("Opened database successfully");

        String query = " insert into car(model,price,condition)"
                    + " values (?, ?, ?)";


            PreparedStatement preparedStmt = c.prepareStatement(query);
            preparedStmt.setString (1, "volvo");
            preparedStmt.setInt (2, 122312);
            preparedStmt.setString   (3,"Used");
            System.out.println("Your car ");
            preparedStmt.execute();
            System.out.println("Your car has been entered in the database");


    } catch (SQLException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }
}
}
