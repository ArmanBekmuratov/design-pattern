package com.arman.basepatterns.structual.facade;

public class App {
    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade();
        facade.startEngine();
    }
}
