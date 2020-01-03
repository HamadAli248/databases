package com.company;

import com.company.idea.AddingACar.AddingCar;
import com.company.idea.BringingBackData.BringingBackData;
import com.company.idea.CheckingCar.CheckingCar;

public class Main {
    public static void main(String args[]) {

        // To run the file which will bring back the data;
//
//        BringingBackData.data(args);
        AddingCar.main(args);


        CheckingCar.selectedCar(args);


        }}

//        Connection c = null;
//
//        try {
//            Class.forName("org.postgresql.Driver");
//            c = DriverManager
//                    .getConnection("jdbc:postgresql://localhost:5432/practing",
//                            "hamad", "password");
//            System.out.println("Opened database successfully");
//
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM car where model = 'mondeo'");
//
//            if(rs.next()){
//                System.out.println("Yor car is mondeo");
//            }


//           INSERTING DATA TO A TABLE
//
//            String query = " insert into car(model,price,condition)"
//                    + " values (?, ?, ?)";
//
//            // create the mysql insert preparedstatemtent
//            PreparedStatement preparedStmt = c.prepareStatement(query);
//            preparedStmt.setString (1, "VW");
//            preparedStmt.setInt (2, 12231);
//            preparedStmt.setString   (3,"Used");
//
//            // execute the preparedstatement
//            preparedStmt.execute();



