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
public class EditController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String instru_type = request.getParameter("instru_type");
        if( instru_type.compareTo("guitar") == 0 ){
            GuitarDAO listGuitar = new GuitarDAOImpl();
            Guitar g = listGuitar.search(id);
            request.setAttribute("g", g);
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/edit.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String instru_type = request.getParameter("instru_type");
        if( instru_type.compareTo("guitar") == 0 ){
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));
            String type = request.getParameter("type");
            String image = request.getParameter("image");
            
            GuitarDAO listGuitar = new GuitarDAOImpl();
            listGuitar.edit(id, new Guitar(0, price, name, instru_type, type, image));
        }
        request.setAttribute("mess", "Sửa thành công");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/edit.jsp");
        rd.forward(request, response);
    }

}
