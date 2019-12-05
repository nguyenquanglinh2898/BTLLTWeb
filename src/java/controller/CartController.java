/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Item;
import model.ItemDAO;
import model.ItemDAOImpl;

/**
 *
 * @author nguye
 */
public class CartController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/cart.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idInstru = Integer.parseInt(request.getParameter("idInstru"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String instru_type = request.getParameter("instru_type");
        String image = request.getParameter("image");
        
//        ItemDAO listItem = new ItemDAOImpl();
//        listItem.add(new Item(listItem.getAllItem().size()+1, idInstru, name, price, 1, instru_type, image));
        
        HttpSession session = request.getSession();
        List <Item> listItem = (List <Item>)session.getAttribute("listItem");
        listItem.add(new Item(listItem.size()+1, idInstru, name, price, 1, instru_type, image));
        
        for( Item i : listItem )
            System.out.println(i);
//        request.setAttribute("listItem", listItem.getAllItem());
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/cart.jsp");
        rd.forward(request, response);

//        response.sendRedirect("cart");
    }


}
