package com.example.bt1.controllers;

import com.example.bt1.models.Customer;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("")
public class CustomerServlet extends HttpServlet {
    private final List<Customer> customers = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        customers.add(new Customer("Mai Văn Hoàn", convertToDate("1983-08-20"), "Hà Nội", "https://images.unsplash.com/photo-1577219491135-ce391730fb2c?q=80&w=1954&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        customers.add(new Customer("Nguyễn Văn Nam", convertToDate("1983-08-21"), "Bắc Giang", "https://images.unsplash.com/photo-1540569014015-19a7be504e3a?q=80&w=1935&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        customers.add(new Customer("Nguyễn Thái Hòa", convertToDate("1983-08-22"), "Nam Định", "https://plus.unsplash.com/premium_photo-1664536392779-049ba8fde933?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        customers.add(new Customer("Trần Đăng Khoa", convertToDate("1983-08-17"), "Hà Tây", "https://images.unsplash.com/photo-1543610892-0b1f7e6d8ac1?q=80&w=1856&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
        customers.add(new Customer("Nguyễn Đình Thi", convertToDate("1983-08-19"), "Hà Nội", "https://images.unsplash.com/photo-1569913486515-b74bf7751574?q=80&w=1889&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"));
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
    }

    private LocalDate convertToDate (String inputDate) {
        return LocalDate.parse(inputDate);
    }
}