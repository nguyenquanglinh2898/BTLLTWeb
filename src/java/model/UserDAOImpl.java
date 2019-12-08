/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class UserDAOImpl implements UserDAO{

    public UserDAOImpl() {
    }
    
    @Override
    public List<User> getAllUser() {
        List <User> listUser = new ArrayList<>();
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("SELECT * FROM user");
            ResultSet res = p.executeQuery();
            
            while(res.next()){
                int id = res.getInt("id");
                String username = res.getString("username");
                String password = res.getString("password");
                String role = res.getString("role");
                listUser.add(new User(id, username, password, role));
            }
            
            closeResultSet(res);
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
    }

    @Override
    public User search(String username) {
        User u = null;
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("SELECT * "
                                                      + "FROM user "
                                                      + "WHERE user.username = ?" );
            
            p.setString(1, username);
            
            ResultSet res = p.executeQuery();
            
            res.next();
            int id = res.getInt("id");
            String password = res.getString("password");
            String role = res.getString("role");
            u = new User(id, username, password, role);
            
            closeResultSet(res);
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(GuitarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    @Override
    public void add(User u) {
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("INSERT INTO user (username, password, role)"
                                                      + "VALUES (?,?,?)");
            p.setString(1, u.getUsername());
            p.setString(2, u.getPassword());
            p.setString(3, u.getRole());

            p.executeUpdate();
            
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeStament( Statement s ){
        try{
            if (s != null)
                s.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void closePreparedStatement(Statement ps)
    {
        try{
            if (ps != null)
            ps.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void closeResultSet(ResultSet rs)
    {
        try{
            if (rs != null)
            rs.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
