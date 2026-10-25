package com.example.login;
;
import java.sql.*;
import java.util.ArrayList;

public class Database {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    ArrayList<InformationOperator> informationOperators = new ArrayList<>();

    public void getInformationOperator()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Covid_19_pbl", "root", "15042002");
            pst = conn.prepareStatement("select * from Xodimlar");
            rs = pst.executeQuery();
            while (rs.next()) {
                String login = rs.getString("login");
                String parol = rs.getString("parol");
                informationOperators.add(new InformationOperator(login, parol));
            }
            rs.close();
            pst.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println();
        }
    }

    public ArrayList<InformationOperator> getInformationOperators() {
        return informationOperators;
    }
}