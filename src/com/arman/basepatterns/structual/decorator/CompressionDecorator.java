package com.arman.basepatterns.structual.decorator;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    private String compress(String s) {
        return "compressed data" + s;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return super.readData();
    }

    @Override
    public String toString() {
        return "CompressionDecorator{" +
                "dataSource=" + dataSource +
                '}';
    }
}
