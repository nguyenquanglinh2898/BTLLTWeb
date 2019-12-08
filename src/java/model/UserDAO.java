/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author nguye
 */
public interface UserDAO {
    List <User> getAllUser();
    User search( String username );
    void add( User u );
}
