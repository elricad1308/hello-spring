package org.example;

public class Goose {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Goose: " + this.name;
    }
}
