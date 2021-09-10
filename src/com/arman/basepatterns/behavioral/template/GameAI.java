package com.arman.basepatterns.behavioral.template;

public abstract class GameAI {

    public void buildUnits() {
        System.out.println("Building units...");
    }

    public abstract void builtStructure();

    public void attack() {
        System.out.println("Attacking ...");
    }


}
