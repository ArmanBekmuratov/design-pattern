package com.arman.basepatterns.structual.decorator;

public class App {
    public static void main(String[] args) {
        String file = "Hello";

        DataSourceDecorator dataSourceDecorator = new CompressionDecorator(
                                                    new EncryptionDataDecorator(
                                                            new FileDataSource(file)));

        System.out.println(dataSourceDecorator);
    }
}
