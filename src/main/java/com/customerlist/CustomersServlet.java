package com.customerlist;

import model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CustomersServlet", value = "/hello-servlet")
public class CustomersServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Customer> customersList = new ArrayList<>();
        customersList.add(new Customer("Trung", "07-04-1993", "Ha Nam", "C:\\Users\\User\\Desktop\\module3\\baitapjstl2609\\customerlist\\src\\main\\java\\com\\image\\ronaldo-2928.jpg"));
        customersList.add(new Customer("Long","21-12-2001","Thai Binh","C:\\Users\\User\\Desktop\\module3\\baitapjstl2609\\customerlist\\src\\main\\java\\com\\image\\David_de_Gea_2017.jpg"));
        customersList.add(new Customer("Quan","14-04-1993","HP","C:\\Users\\User\\Desktop\\module3\\baitapjstl2609\\customerlist\\src\\main\\java\\com\\image\\bruno.jpg"));
        request.setAttribute("customerlist",customersList);
        System.out.print(customersList.get(1));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customerlist.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}
