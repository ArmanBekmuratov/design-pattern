package com.arman.basepatterns.behavioral.template;

public class OrcAI extends GameAI{

    @Override
    public void buildUnits() {
        super.buildUnits();
        System.out.println("ORCS");
    }

    @Override
    public void builtStructure() {
        System.out.println("Orcs are Building barracks...");
    }


}
