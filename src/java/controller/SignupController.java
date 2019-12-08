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
import model.User;
import model.UserDAO;
import model.UserDAOImpl;

/**
 *
 * @author nguye
 */
public class SignupController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/signup.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        UserDAO listUser = new UserDAOImpl();
        User u = listUser.search(username);
        
        if( u == null ){
            request.setAttribute("mess", "Đăng kí thành công");
            listUser.add(new User(0, username, password, "customer"));
            request.setAttribute("mess", "Đăng kí thành công");
        }
        else{
            request.setAttribute("mess", "Đăng kí không thành công");
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/signup.jsp");
        rd.forward(request, response);
    }

}
