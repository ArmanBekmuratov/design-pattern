package com.arman.basepatterns.creational.abstractfabric.football;

import com.arman.basepatterns.creational.abstractfabric.Sportsman;

public class Footballer implements Sportsman {
    @Override
    public void train() {
        System.out.println("Footballer is training now...");
    }
}
