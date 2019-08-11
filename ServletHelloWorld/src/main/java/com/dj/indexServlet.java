package com.dj;

import com.sun.net.httpserver.HttpServer;

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
@WebServlet(name = "indexServlet")
public class indexServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("indexServlet doget...");
        response.sendRedirect("index.jsp");
//        request.getRequestDispatcher("/index.jsp").forward(request, response);

//        response.setContentType("text/html");
//        PrintWriter pw = response.getWriter();
//        pw.write("<!DOCTYPEhtml>");
//        pw.write("<html>");
//        pw.write("<head>");
//        pw.write("<title>");
//        pw.write("index");
//        pw.write("</title>");
//        pw.write("</head>");
//        pw.write("<body>");
//        pw.write("index");
//        pw.write("/body");
//        pw.write("/html");
    }
}