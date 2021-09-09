package com.arman.basepatterns.behavioral.command;

public class App {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Broker broker = new Broker(new BuyStock(stock), new SellStock(stock));
        broker.buyStock();
        broker.sellStock();
    }
}
