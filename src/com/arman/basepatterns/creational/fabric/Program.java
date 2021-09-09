package com.arman.basepatterns.creational.fabric;

public class Program {
    public static void main(String[] args) {
        SportsmanFactory sportsmanFactory = createSportsmanFactoryBySport("box");
        Sportsman sportsman = sportsmanFactory.createSportsman();
        sportsman.train();
    }

    static SportsmanFactory createSportsmanFactoryBySport(String sport) {
        if (sport.equalsIgnoreCase("box")) {
            return new BoxerSportsmanFactory();
        } else if (sport.equalsIgnoreCase("football")) {
            return new FootballerSportsmanFactory();
        } else throw  new RuntimeException("Such a sport is not in program");
    }
}
