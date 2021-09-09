package com.arman.basepatterns.creational.singleton;


public class DataBase {
    private static DataBase dataBase;

    private DataBase() {

    }

    public static synchronized DataBase getInstance() {
        if (dataBase == null)
            dataBase = new DataBase();
        return dataBase;
    }

    public void query(String sql) {
        System.out.println("Performing sql query " + sql);
    }
}
