package com.arman.basepatterns.behavioral.command;

public class SellStock implements Order{

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    Stock stock;
    @Override
    public void execute() {
        stock.sell();
    }
}
