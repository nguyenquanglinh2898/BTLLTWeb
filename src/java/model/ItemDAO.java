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
public interface ItemDAO {
    List <Item> getAllItem();
    void add( Item i );
    void delete( int i );
    void editQuantity( int i, String type );
    int search( int idInstru, String instru_type );
    int getTotalPrice();
}
