package com.arman.basepatterns.creational.abstractfabric;

import com.arman.basepatterns.creational.abstractfabric.football.FootballTeamFactory;

public class Ring  {
    public static void main(String[] args) {
        SportTeamFactory s = new FootballTeamFactory();
        Sportsman sportsman = s.getSportsman();
        Medic medic = s.getMedic();
        Trainer trainer = s.getTrainer();
        System.out.println("Creating trainer now...");
        sportsman.train();
        medic.cureSportsman();
        trainer.coach();
    }
}
