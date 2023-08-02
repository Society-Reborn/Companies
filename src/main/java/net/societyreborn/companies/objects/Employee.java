package net.societyreborn.companies.objects;


import org.bukkit.entity.Player;

import java.io.Serializable;

public class Employee implements Serializable {
    private final Player player;

    public Employee(Player player) {
        this.player = player;
    }
}
