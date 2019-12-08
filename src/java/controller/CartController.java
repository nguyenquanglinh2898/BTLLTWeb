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
        HttpSession session = request.getSession();
        if( session.getAttribute("user") == null ){
            response.sendRedirect("signin");
        }
        else{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/cart.jsp");
            rd.forward(request, response);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if( session.getAttribute("user") == null ){
            response.sendRedirect("signin");
        }
        else{
            int idInstru = Integer.parseInt(request.getParameter("idInstru"));
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));
            String instru_type = request.getParameter("instru_type");
            String image = request.getParameter("image");
            
            ItemDAOImpl listItem = (ItemDAOImpl)session.getAttribute("listItem");
            int stt = listItem.search(idInstru, instru_type);
            if( stt == -1 ){
                listItem.add(new Item(idInstru, name, price, 1, instru_type, image));
            }
    //        ItemDAO listItem = new ItemDAOImpl();
    //        listItem.add(new Item(listItem.getAllItem().size()+1, idInstru, name, price, 1, instru_type, image));
            

    //        request.setAttribute("listItem", listItem.getAllItem());

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/cart.jsp");
            rd.forward(request, response);

    //        response.sendRedirect("cart");
        }
    }


}
