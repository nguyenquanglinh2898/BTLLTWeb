/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class ItemDAOImpl implements  ItemDAO{
    List <Item> listItem = new ArrayList<>();
    
    @Override
    public List<Item> getAllItem() {
        return listItem;
    }

    @Override
    public void add(Item i) {
        listItem.add(i);
    }

    @Override
    public void delete(int id) {
        listItem.remove(id);
    }

    @Override
    public void editQuantity(int id, int quantity) {
        listItem.get(id).setQuantity(quantity);
    }
    
}
