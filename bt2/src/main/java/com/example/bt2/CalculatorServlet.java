package com.example.bt2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double first = Double.parseDouble(req.getParameter("first"));
        double second = Double.parseDouble(req.getParameter("second"));
        String operator = req.getParameter("operator");

        String result = null;
        
        switch (operator) {
            case "cong":
                result = first + " + " + second + " = " + (first + second);
                break;
            case "tru":
                result = first + " - " + second + " = " + (first - second);
                break;
            case "nhan":
                result = first + " * " + second + " = " + (first * second);
                break;
            case "chia":
                result = first + " / " + second + " = " + (first / second);
                System.out.println(result);
                if(result.equals("10.0 / 0.0 = Infinity")) {
                    result = first + " / " + second + " = 0.0";
                }
                break;
            default:
                break;
        }

        req.setAttribute("result", result);
        req.getRequestDispatcher("/calculator.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}