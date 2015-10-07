package com.aidar;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "CalcServlet", urlPatterns = "/calc")
public class CalcServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Double res = null;
        try {
            Double fNum = Double.parseDouble(request.getParameter("firstNum"));
            Double sNum = Double.parseDouble(request.getParameter("secondNum"));
            String op = request.getParameter("operation");
            if (op.equals("sum")) {
                res = fNum + sNum;
            }
            if (op.equals("subt")) {
                res = fNum - sNum;
            }
            if (op.equals("mult")) {
                res = fNum * sNum;
            }
            if (op.equals("div")) {
                res = fNum / sNum;
                if (res.toString().equals("Infinity") || res.toString().equals("NaN")) {
                    throw new ArithmeticException();
                }
            }
            request.setAttribute("result", res);
            request.getRequestDispatcher("WEB-INF/result.jsp").forward(request, response);
        } catch (ArithmeticException e) {
            response.sendRedirect("/calc?error=divisionByZero");
        }
        catch (Exception e) {
            response.sendRedirect("/calc?error=invalidArguments");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/form.jsp").forward(request, response);
    }

}
