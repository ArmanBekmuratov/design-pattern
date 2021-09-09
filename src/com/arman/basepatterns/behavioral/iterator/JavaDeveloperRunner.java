package com.arman.basepatterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String [] skills = {"java", "spring", "maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Ara", skills );

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer"  + javaDeveloper.getName());

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
