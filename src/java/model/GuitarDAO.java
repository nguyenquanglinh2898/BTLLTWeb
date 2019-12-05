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
public interface GuitarDAO {
    List <Guitar> getAllGuitar();
    void add( Guitar g );
    void edit( int id, Guitar g );
    void delete( int id );
    Guitar search( int id );
}
