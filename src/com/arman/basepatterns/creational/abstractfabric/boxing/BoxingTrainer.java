package com.arman.basepatterns.creational.abstractfabric.boxing;

import com.arman.basepatterns.creational.abstractfabric.Trainer;

public class BoxingTrainer implements Trainer {
    @Override
    public void coach() {
        System.out.println("Boxing trainer is coaching now ...");
    }
}
