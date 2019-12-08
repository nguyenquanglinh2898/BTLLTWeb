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
import model.ItemDAO;
import model.ItemDAOImpl;
import model.User;
import model.UserDAO;
import model.UserDAOImpl;

/**
 *
 * @author nguye
 */
public class SigninController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("user", null);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/signin.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        UserDAO listUser = new UserDAOImpl();
        User u = listUser.search(username);
        
        if( u == null || u.getPassword().compareTo(password) != 0 ){
            request.setAttribute("mess", "Sai tên đăng nhập hoặc mật khẩu");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/signin.jsp");
            rd.forward(request, response);
        }
        else{
            HttpSession session = request.getSession();
            session.setAttribute("user", u);
                ItemDAO listItem = new ItemDAOImpl();
            session.setAttribute("listItem", listItem);

            response.sendRedirect("/BTLLTWeb");
        }
    }

}
