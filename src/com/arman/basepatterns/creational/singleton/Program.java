package com.arman.basepatterns.creational.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstance();
        dataBase.query("SELECT FROM...");
    }
}
