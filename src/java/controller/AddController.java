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
import model.Guitar;
import model.GuitarDAO;
import model.GuitarDAOImpl;

/**
 *
 * @author nguye
 */
public class AddController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/add.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String instru_type = request.getParameter("instru_type");
        if( instru_type.compareTo("guitar") == 0 ){
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));
            String type = request.getParameter("type");
            String image = request.getParameter("image");
            
            GuitarDAO listGuitar = new GuitarDAOImpl();
            listGuitar.add(new Guitar(0, price, name, instru_type, type, image));
            
        }
        request.setAttribute("mess", "Thêm thành công");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/add.jsp");
        rd.forward(request, response);

    }

}
