package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{

    public Employer(String value) {
        super(value);
    }
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }
//
//    public Employer(String value) {
//        this();
//        this.value = value;
//    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer employer)) return false;
        return getId() == employer.getId();
    }


    // Getters and Setters:

}
