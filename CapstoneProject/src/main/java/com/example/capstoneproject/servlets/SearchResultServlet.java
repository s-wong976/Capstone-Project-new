 package com.example.capstoneproject.servlets;

import com.example.capstoneproject.beans.FoodItem;
import com.example.capstoneproject.dao.ApplicationDao;
import com.example.capstoneproject.services.ApplicationService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "searchResultServlet", value = "/search-result-servlet")

public class SearchResultServlet extends HttpServlet {
    private String message;
    private ApplicationService service;
    public void init() {
        service=new ApplicationDao();
        message = "search food";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String keyword = request.getParameter("keyword");

        List<FoodItem> searchResult = service.search(keyword);



        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("  <form action=\"search-result-servlet\">\n" +
                "  <input type=\"text\"  name=\"keyword\" >\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ");

        for (FoodItem foodItem:searchResult) {
            out.println("<h1>" + foodItem.getName() + "</h1>");
            out.println("<h2>" + foodItem.getPrice() + "</h2>");


        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
