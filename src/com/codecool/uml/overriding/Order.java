package com.codecool.uml.overriding;

public class Order implements IOrderable {
    private int id;
    private String status;

    public Order(int id, String status) {
        this.id = id;
        this.status = status;
    }



    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean pay() {
        if (true) {
            status = "payed";
            return true;
        }
        else {
            status = "checked";
            return false;
        }

    }

    @Override
    public boolean checkout() {
        if (true) {
            status = "checked";
            return true;
        }
        else {
            status = "new";
            return false;
        }
    }
}
