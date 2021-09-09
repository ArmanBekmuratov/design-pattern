package com.arman.basepatterns.structual.facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int limit) {
        System.out.println("limit is " + limit);
    }

    public void run() {
        System.out.println("Cooling controller is running...");
    }
}
