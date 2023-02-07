//Owen Riske
package com.company;


public class merch {
    //Create our PROPERTIES
    String name;
    double price;
    int quantityInStock;

    //Constructor
    merch(String name, double price, int quantityInStock){
        this.name=name;
        this.price=price;
        this.quantityInStock=quantityInStock;
    }

    //change the amount of stock
    void setStock(int newQuantityInStock){
        this.quantityInStock=newQuantityInStock;
    }
    void restock(int addedStock){
        this.quantityInStock+=addedStock;
    }
    double sell(int amountSold){
        if (amountSold>quantityInStock){
            System.out.println("ERROR: There are only"+quantityInStock+" "+name+" in stock\nSale canceled\n\n");
            return 0d;
        }
        else {
            this.quantityInStock -= amountSold;
            return price*amountSold;
        }

    }
    void setName(String newName){
        name=newName;
    }
    void setPrice(int newPrice){
        this.price=newPrice;
    }

    String getName(){
        return name;
    }
    double getPrice(){
        return price;
    }


}


