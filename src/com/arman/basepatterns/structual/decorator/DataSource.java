package com.arman.basepatterns.structual.decorator;

public interface DataSource {
    void writeData(String data);
    String readData();
}
