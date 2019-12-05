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
public class Guitar {
    private int id, price;
    private String name, instru_type, type, image;

    public Guitar() {
    }

    public Guitar(int id, int price, String name, String instru_type, String type, String image) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.instru_type = instru_type;
        this.type = type;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    
    @Override
    public String toString() {
        return id + "|" + name + "|" + instru_type + "|" + type + "|" + price + "|" + image;
    }
    
}
