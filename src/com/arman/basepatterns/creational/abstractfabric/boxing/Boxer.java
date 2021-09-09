package com.arman.basepatterns.creational.abstractfabric.boxing;

import com.arman.basepatterns.creational.abstractfabric.Sportsman;

public class Boxer implements Sportsman {
    @Override
    public void train() {
        System.out.println("Boxer is training now..");
    }
}
