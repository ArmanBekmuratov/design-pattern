package com.arman.basepatterns.structual.adapter;

public class App {
    public static void main(String[] args) {
        Person person = new Person(new EuropeSocketAdapter());
        person.joinToUsaSocket();
    }
}
