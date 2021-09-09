package com.arman.basepatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + this.name + " \n We have some changers in vacancies:" + vacancies);
    }
}
