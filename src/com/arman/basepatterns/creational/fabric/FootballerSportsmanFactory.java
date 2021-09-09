package com.arman.basepatterns.creational.fabric;

public class FootballerSportsmanFactory implements SportsmanFactory{
    @Override
    public Sportsman createSportsman() {
        return new Footballer();
    }
}
