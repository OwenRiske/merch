//Owen Riske
package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList for storing a list of objects
        ArrayList<merch> inventory=new ArrayList<>();

        //merchandise
        merch i0001 = new merch("Pool Noodle",1000000.00, 32);
        inventory.add(i0001);
        merch i0002=new merch("Expired Milk", 9.50,5);
        inventory.add(i0002);
        merch i0003=new merch("Canned Soup",3.50,10);
        inventory.add(i0003);
        merch i0004=new merch("Stegosaurus",0.01,5000000);
        inventory.add(i0004);
        merch i0005=new merch("Dried Concrete",5.0,1000);
        inventory.add(i0005);
        merch i0006=new merch("Food",2.00,7);
        inventory.add(i0006);
        merch i0007=new merch("Fermented Grapes",10.03,2);
        inventory.add(i0007);
        merch i0008=new merch("Half a Chair",13.10,26);
        inventory.add(i0008);
        merch i0009=new merch("Bottleless Bottle",598.23,44);
        inventory.add(i0009);
        merch i0010=new merch("Floor Tile",67.89,45);
        inventory.add(i0010);




        //for each loop to iterate through our ArrayList
        //foreach
        //for ("data type""name":"in ArrayList")
        for (merch item:inventory) {
            System.out.println(item.quantityInStock+" "+item.name+" at the price of $"+item.price+"\n");
        }
    }
}
