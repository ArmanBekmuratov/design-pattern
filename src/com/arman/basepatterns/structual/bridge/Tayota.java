package com.arman.basepatterns.structual.bridge;

public class Tayota extends Car{

    public Tayota(Color color) {
        super(color);
    }

    @Override
    public String draw() {
       return "Tayota is drawn " +  color.fill();
    }
}
