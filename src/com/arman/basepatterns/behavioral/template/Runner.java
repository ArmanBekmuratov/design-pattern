package com.arman.basepatterns.behavioral.template;

public class Runner {
    public static void main(String[] args) {
        MonsterAI monsterAI = new MonsterAI();
        OrcAI orcAI = new OrcAI();

        monsterAI.builtStructure();
        orcAI.builtStructure();

        monsterAI.buildUnits();
        orcAI.buildUnits();
    }
}
