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
    public void delete(int i) {
        listItem.remove(i);
    }

    @Override
    public void editQuantity(int i, String type ) {
        if( type.compareTo("increase") == 0 )
            listItem.get(i).setQuantity(listItem.get(i).getQuantity()+1);
        else
            if( listItem.get(i).getQuantity() > 0 )
                listItem.get(i).setQuantity(listItem.get(i).getQuantity()-1);
            else
                listItem.get(i).setQuantity(0);
    }

    @Override
    public int search(int idInstru, String instru_type) {
        for( int i = 0 ; i < listItem.size() ; i++ )
            if( listItem.get(i).getIdInstru() == idInstru && listItem.get(i).getInstru_type().compareTo(instru_type) == 0 )
                return i;
        return -1;
    }

    @Override
    public int getTotalPrice() {
        int total = 0;
        for( Item i : listItem )
            total += i.getPrice()*i.getQuantity();
        return total;
    }
    
    public String getDotPrice( int p ){
        int t = 0;
        String priceRev = "";
        String pricee = String.valueOf(p);
        for( int i = pricee.length()-1 ; i >= 0 ; i-- ){
            t++ ;
            priceRev += pricee.charAt(i);
            if( t%3 == 0 ) priceRev += ".";
        }
        String price = "";
        for( int i = 0 ; i < priceRev.length() ; i++ )
            price += priceRev.charAt(priceRev.length()-i-1);
        
        return price;
    }
    
    public void clear(){
        listItem.clear();
    }
}
