package com.arman.basepatterns.structual.flyweight;

import java.util.Random;

public class App {

    public static void main(String[] args) {
            Player p1 = PlayerFactory.getPlayer("terrorist");
            p1.assignWeapon("AK-47");
            p1.mission();

            Player p2 = PlayerFactory.getPlayer("counter-terrorist");
            p2.assignWeapon("M16");
            p2.mission();

    }

}