package com.arman.basepatterns.behavioral.command;

public class Broker {
    Order buyStock;
    Order sellStock;

    public Broker(Order buyStock, Order sellStock) {
        this.buyStock = buyStock;
        this.sellStock = sellStock;
    }

    public void sellStock() {
        sellStock.execute();
    }
    public void buyStock() {
       buyStock.execute();
    }
}
