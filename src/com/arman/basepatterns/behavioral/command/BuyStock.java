package com.arman.basepatterns.behavioral.command;

public class BuyStock implements Order{
    Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
