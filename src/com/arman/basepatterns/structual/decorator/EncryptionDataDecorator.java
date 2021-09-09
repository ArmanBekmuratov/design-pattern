package com.arman.basepatterns.structual.decorator;

public class EncryptionDataDecorator extends DataSourceDecorator{
    public EncryptionDataDecorator(DataSource dataSource) {
        super(dataSource);
    }

    private String decode() {
        return "encrypted data";
    }

    private String encode(String data) {
        return "encoded data";
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return super.readData() + decode();
    }

    @Override
    public String toString() {
        return "EncryptionDataDecorator{" +
                "dataSource=" + dataSource +
                '}';
    }
}
