package com.arman.basepatterns.structual.bridge;

public class App {
    public static void main(String[] args) {
        Car tayota = new Tayota(new Blue());
        System.out.println(tayota.draw());
    }
}
