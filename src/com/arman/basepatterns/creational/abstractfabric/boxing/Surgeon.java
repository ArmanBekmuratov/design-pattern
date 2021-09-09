package com.arman.basepatterns.creational.abstractfabric.boxing;

import com.arman.basepatterns.creational.abstractfabric.Medic;

public class Surgeon  implements Medic {
    @Override
    public void cureSportsman() {
        System.out.println("The surgeon is performing the operation now... ");
    }
}
