/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Guitar;

/**
 *
 * @author nguye
 */
public class GuitarDAOImpl implements GuitarDAO{

    public GuitarDAOImpl() {
    }

    @Override
    public List<Guitar> getAllGuitar() {
        List <Guitar> listGuitar = new ArrayList<>();
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("SELECT * FROM guitar");
            ResultSet res = p.executeQuery();
            
            while(res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                String instru_type = res.getString("instru_type");
                String type = res.getString("type");
                int price = res.getInt("price");
                String image = res.getString("image");
                listGuitar.add(new Guitar(id, price, name, instru_type, type, image));
            }
            
            closeResultSet(res);
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(GuitarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listGuitar;
    }

    @Override
    public void add(Guitar g) {
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("INSERT INTO guitar (name, instru_type, type, price, image)"
                                                      + "VALUES (?,?,?,?,?)");
            p.setString(1, g.getName());
            p.setString(2, g.getInstru_type());
            p.setString(3, g.getType());
            p.setInt(4, g.getPrice());
            p.setString(5, g.getImage());

            p.executeUpdate();
            
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(GuitarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("DELETE FROM guitar "
                                                      + "WHERE guitar.id = ?");
            p.setInt(1, id);
            
            p.executeUpdate();
            
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(GuitarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(int id, Guitar g) {
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("UPDATE guitar "
                                                      + "SET guitar.name=?, guitar.type=?, guitar.price=?, guitar.image=? "
                                                      + "WHERE id=?");
            p.setString(1, g.getName());
            p.setString(2, g.getType());
            p.setInt(3, g.getPrice());
            p.setString(4, g.getImage());
            p.setInt(5, id);

            p.executeUpdate();
            
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(GuitarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Guitar search(int id) {
        Guitar g = null;
        try {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection conn = pool.getConnection();
            
            PreparedStatement p = conn.prepareStatement("SELECT * "
                                                      + "FROM guitar "
                                                      + "WHERE guitar.id = ?" );
            
            p.setInt(1, id);
            
            ResultSet res = p.executeQuery();
            
            res.next();
            String name = res.getString("name");
            String instru_type = res.getString("instru_type");
            String type = res.getString("type");
            int price = res.getInt("price");
            String image = res.getString("image");
            g = new Guitar(id, price, name, instru_type, type, image);
            
            closeResultSet(res);
            closePreparedStatement(p);
            pool.freeConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(GuitarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return g;
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
