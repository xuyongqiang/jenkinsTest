package com.dj;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nero.xu on 2019/6/1.
 */
@WebServlet(name = "getMessageServlet")
public class getMessageServlet extends HttpServlet {
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();

        if(username.equals("1") && password.equals("1")){
            pw.write("login successfully");
//            response.sendRedirect("pageWithData.jsp");
        }else{
            pw.write("login failed");
        }
        pw.close();


    }
}