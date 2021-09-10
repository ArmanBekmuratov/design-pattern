package com.arman.basepatterns.behavioral.strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute() {
        activity.justDoIt();
    }
}
