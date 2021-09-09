package com.arman.basepatterns.structual.proxy;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        load(fileName);
    }

    private void load(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
