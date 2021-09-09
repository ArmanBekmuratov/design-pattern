package com.arman.basepatterns.creational.abstractfabric;

import com.arman.basepatterns.creational.abstractfabric.football.FootballTeamFactory;

public class Stadium {
    public static void main(String[] args) {
        SportTeamFactory sportTeamFactory = new FootballTeamFactory();
        Sportsman footballer = sportTeamFactory.getSportsman();
        Medic medic = sportTeamFactory.getMedic();
        Trainer trainer = sportTeamFactory.getTrainer();
        System.out.println("Creating stadium...");
        footballer.train();
        medic.cureSportsman();
        trainer.coach();
    }
}
