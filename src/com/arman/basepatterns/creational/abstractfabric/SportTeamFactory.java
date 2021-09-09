package com.arman.basepatterns.creational.abstractfabric;

public interface SportTeamFactory {
    Medic getMedic();
    Sportsman getSportsman();
    Trainer getTrainer();
}
