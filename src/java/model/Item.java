/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nguye
 */
public class Item {
    private int id, idInstru, price, quantity;
    private String name, instru_type, image;

    public Item() {
    }

    public Item(int id, int idInstru, String name, int price, int quantity, String instru_type, String image) {
        this.id = id;
        this.idInstru = idInstru;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.instru_type = instru_type;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInstru() {
        return idInstru;
    }

    public void setIdInstru(int idInstru) {
        this.idInstru = idInstru;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstru_type() {
        return instru_type;
    }

    public void setInstru_type(String instru_type) {
        this.instru_type = instru_type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDotPrice(){
        int t = 0;
        String priceRev = "";
        String pricee = String.valueOf(this.price);
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
    
    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", idInstru=" + idInstru + ", price=" + price + ", quantity=" + quantity + ", name=" + name + ", instru_type=" + instru_type + ", image=" + image + '}';
    }
    
    
}
