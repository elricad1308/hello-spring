package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    private final Goose pet;

    public Person (@Qualifier("jozzy") Goose jozzy) {
        this.pet = jozzy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goose getPet() {
        return pet;
    }

}
