package com.arman.basepatterns.creational.abstractfabric.football;

import com.arman.basepatterns.creational.abstractfabric.Medic;

public class Nutritionist implements Medic {
    @Override
    public void cureSportsman() {
        System.out.println("Nutritionist is curing now...");
    }
}
