/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ItemDAOImpl;

/**
 *
 * @author nguye
 */
public class QuantityController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("i"));
        String type = request.getParameter("type");
        HttpSession session = request.getSession();
        ItemDAOImpl listItem = (ItemDAOImpl)session.getAttribute("listItem");
        listItem.editQuantity(i, type);
        
        response.sendRedirect("cart");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
