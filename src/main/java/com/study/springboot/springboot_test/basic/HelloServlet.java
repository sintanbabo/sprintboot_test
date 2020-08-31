package com.study.springboot.springboot_test.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/helloget"})
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet 매써드 호출");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/html");
        writer.println("<html>");
        writer.println("<head>spring booster test</head>");
        writer.println("<body>get test</body>");
        writer.println("</html>");
        
    }
}