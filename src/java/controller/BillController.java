/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ItemDAOImpl;
import model.User;

/**
 *
 * @author nguye
 */
public class BillController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        ItemDAOImpl listItem = (ItemDAOImpl)session.getAttribute("listItem");
        int total = Integer.parseInt(request.getParameter("total"));
        
        request.setAttribute("userID", user.getId());
        request.setAttribute("list", listItem);
        request.setAttribute("total", total);
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/bill.jsp");
        rd.forward(request, response);
    }

}
