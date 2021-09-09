package com.arman.basepatterns.structual.proxy;

public class App {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");
        image.display();
        image.display();
    }
}
