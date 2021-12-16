package com.company.core.payloads;

public abstract class Payload {
    private String name;

    public Payload(String name) {
        this.name = name;
    }

    public abstract double calculateWeight();

    @Override
    public String toString() {
        return this.name + " " + this.calculateWeight() + "kg.";
    }
}
