package com.company;

public class Name implements Comparable<Name>{
    private String name;


    public Name() {
    }

    public Name(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Name o) {
        return name.compareTo(o.getName());
    }
}
