package com.arman.basepatterns.creational.fabric;

public class BoxerSportsmanFactory implements SportsmanFactory{
    @Override
    public Sportsman createSportsman() {
        return new Boxer();
    }
}
