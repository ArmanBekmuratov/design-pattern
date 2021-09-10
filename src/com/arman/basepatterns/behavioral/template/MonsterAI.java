package com.arman.basepatterns.behavioral.template;

public class MonsterAI extends GameAI{
    @Override
    public void builtStructure() {
        System.err.println("MONSTERS CANNOT BUILD STRUCTURES!");
    }
}
