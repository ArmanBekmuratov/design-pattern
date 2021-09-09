package com.arman.basepatterns.behavioral.observer;

import com.arman.basepatterns.behavioral.iterator.JavaDeveloper;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("first java position");
        jobSite.addVacancy("second java position");

        Observer firstSubscriber = new Subscriber("Arman");
        Observer secondSubscriber = new Subscriber("Dana");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("third java position");

        jobSite.removeVacancy("first java position");
    }
}
