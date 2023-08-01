package net.societyreborn.companies.objects;

import java.io.Serializable;

public class Company implements Serializable {
    private final String name;
    private final Employee ceo;
    private final long capital;

    public Company(String name, Employee ceo) {
        capital = 0;
        this.ceo = ceo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getCEO() {
        return ceo;
    }

    public long getCapital() {
        return capital;
    }
}
