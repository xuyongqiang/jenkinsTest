package com.dj;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by nero.xu on 2019/6/13.
 */
public class toRegister extends HttpServlet {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://192.168.199.154:3306/information_user";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("toRegister doPost...");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean ret = false;

        System.out.print(username);
        System.out.print(password);

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();

        ret = doConnectDB(username, password);

        if(true == ret){
            pw.write("regester successfully");
        }else{
            pw.write("regester failed");
        }

        pw.close();
    }

    private boolean doConnectDB(String name, String passwd){
        Connection connection = null;
        try {
            Class.forName(DRIVER_NAME);
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
//            String sql = "select username from user";
            String sql = "insert user set username='"+name+"',password='"+passwd+"'";
            System.out.print(sql);
            PreparedStatement psrt = connection.prepareStatement(sql);

            int result = psrt.executeUpdate();
            System.out.print(result);

//            while (rs.next()){
//                System.out.println("username:" + rs.getString("username"));
//            }
            return true;
        }catch (Exception e){
            System.out.print(e.toString());
        }

        return false;
    }
}