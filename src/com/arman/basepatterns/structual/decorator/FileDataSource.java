package com.arman.basepatterns.structual.decorator;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String fileName) {
        System.out.println("Write File " + fileName);
    }

    @Override
    public String readData() {
        return "read file";
    }

    @Override
    public String toString() {
        return "FileDataSource{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
