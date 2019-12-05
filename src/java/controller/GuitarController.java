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
import model.GuitarDAOImpl;
import model.ItemDAO;
import model.ItemDAOImpl;

/**
 *
 * @author nguye
 */
public class GuitarController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GuitarDAOImpl guitar = new GuitarDAOImpl();
        request.setAttribute("list", guitar.getAllGuitar());
        
        ItemDAO listItem = new ItemDAOImpl();
        HttpSession session = request.getSession();
        session.setAttribute("listItem", listItem.getAllItem());
        
        String url = "/guitar.jsp";
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

   
    

    
}
