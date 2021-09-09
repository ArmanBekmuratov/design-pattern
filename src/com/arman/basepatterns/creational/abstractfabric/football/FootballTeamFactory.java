package com.arman.basepatterns.creational.abstractfabric.football;

import com.arman.basepatterns.creational.abstractfabric.Medic;
import com.arman.basepatterns.creational.abstractfabric.SportTeamFactory;
import com.arman.basepatterns.creational.abstractfabric.Sportsman;
import com.arman.basepatterns.creational.abstractfabric.Trainer;

public class FootballTeamFactory implements SportTeamFactory {
    @Override
    public Medic getMedic() {
        return new Nutritionist();
    }

    @Override
    public Sportsman getSportsman() {
        return new Footballer();
    }

    @Override
    public Trainer getTrainer() {
        return new FootballTrainer();
    }
}
