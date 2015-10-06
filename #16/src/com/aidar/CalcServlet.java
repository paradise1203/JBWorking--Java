package com.aidar;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "CalcServlet", urlPatterns = "/calc")
public class CalcServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Double res = null;
        try {
            Double fNum = Double.parseDouble(request.getParameter("firstNum"));
            Double sNum = Double.parseDouble(request.getParameter("secondNum"));
            String op = request.getParameter("operation");
            if (op.equals("sum"))
                res = fNum + sNum;
            else if (op.equals("subt"))
                res = fNum - sNum;
            else if (op.equals("mult"))
                res = fNum * sNum;
            else
                res = fNum / sNum;
            request.setAttribute("result", res);
            request.getRequestDispatcher("WEB-INF/result.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("/calc?error=true");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/form.jsp").forward(request, response);
    }

}
