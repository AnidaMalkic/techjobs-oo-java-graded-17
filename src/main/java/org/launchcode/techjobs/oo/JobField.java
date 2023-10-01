package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField(String value) {
        this();
        this.value = value;
    }
    public JobField() {
    }

    @Override
    public String toString() {
        return value;
    }
    public int getId() {return id;};
    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
