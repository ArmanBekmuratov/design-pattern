package com.arman.basepatterns.structual.adapter;

public class EuropeSocketAdapter implements UsaSocket {
    private EuropeSocket europeSocket;

    public EuropeSocketAdapter() {
        europeSocket = new EuropeSocket();
    }

    @Override
    public void join() {
        europeSocket.joinToEuropeSocket();
    }
}
