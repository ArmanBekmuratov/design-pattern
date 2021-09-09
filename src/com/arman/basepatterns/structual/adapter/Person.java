package com.arman.basepatterns.structual.adapter;

public class Person {
    private UsaSocket usaSocket;

    public Person(UsaSocket usaSocket) {
        this.usaSocket = usaSocket;
    }

    public Person() {
    }

    public UsaSocket getUsaSocket() {
        return usaSocket;
    }

    public void setUsaSocket(UsaSocket usaSocket) {
        this.usaSocket = usaSocket;
    }

    public void joinToUsaSocket() {
        System.out.println("Joining to socket in USA...");
        usaSocket.join();
        System.out.println();
    }
}
