package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {







        Order first = new Order(1,"new");
        System.out.println(first);


        first.pay();
        System.out.println(first.getStatus());

        first.checkout();
        System.out.println(first.getStatus());


    }

    public static int generateid () {
        int id = 0;
        id =+ 1;
        id = id;
        return id;
    }

}
