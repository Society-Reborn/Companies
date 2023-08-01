package net.societyreborn.companies.objects;

import com.Zrips.CMI.Containers.CMIUser;

import java.io.Serializable;

public class Employee implements Serializable {
    private final CMIUser player;

    public Employee(CMIUser player) {
        this.player = player;
    }
}
