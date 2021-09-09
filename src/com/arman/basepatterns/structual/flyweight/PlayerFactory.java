package com.arman.basepatterns.structual.flyweight;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class PlayerFactory  {
    private static HashMap<String, Player> players = new HashMap<>();

    public static Player getPlayer(String type) {
            Player p = null;

            if (players.containsKey(type)) {
                players.get(p);
            }
            else {
                switch (type) {
                    case "terrorist":
                        System.out.println("Terrorist is created...");
                        p = new Terrorist();
                        break;
                    case "counter-terrorist":
                        System.out.println("Counter-Terrorist is created...");
                        p = new CounterTerrorist();
                        break;
                    default:
                        System.out.println("Unreachable statement");;
                }
                players.put(type,p);
            }
            return p;
    }
}
