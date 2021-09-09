package com.arman.basepatterns.creational.abstractfabric.boxing;

import com.arman.basepatterns.creational.abstractfabric.Medic;
import com.arman.basepatterns.creational.abstractfabric.SportTeamFactory;
import com.arman.basepatterns.creational.abstractfabric.Sportsman;
import com.arman.basepatterns.creational.abstractfabric.Trainer;

public class BoxingTeamFactory implements SportTeamFactory {
    @Override
    public Medic getMedic() {
        return new Surgeon();
    }

    @Override
    public Sportsman getSportsman() {
        return new Boxer();
    }

    @Override
    public Trainer getTrainer() {
        return new BoxingTrainer();
    }
}
