package com.arman.basepatterns.creational.abstractfabric.football;

import com.arman.basepatterns.creational.abstractfabric.Trainer;

public class FootballTrainer implements Trainer
{
    @Override
    public void coach() {
        System.out.println("Football trainer is coaching now...");
    }
}
