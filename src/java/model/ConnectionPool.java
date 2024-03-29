/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;

/**
 *
 * @author nguye
 */
public class ConnectionPool {
    
    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;

    private ConnectionPool(){
        try{
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) 
                ic.lookup("jdbc/tygy");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ConnectionPool getInstance(){
        if (pool == null){
            pool = new ConnectionPool();
        }
        return pool;
    }

    
    public static Connection getConnection(){
        try{
            return dataSource.getConnection();
        }
        catch (SQLException sqle){
            sqle.printStackTrace();
            return null;
        }
    }
    
    public static void freeConnection(Connection c){
        try{
            c.close();
        }
        catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
