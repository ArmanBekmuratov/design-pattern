package com.arman.basepatterns.behavioral.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewrite code after junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fix database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating good test");
    }
}
