package com.company.core.payloads;

public class SimplePayload extends Payload {
    private double weihgt;

    public SimplePayload(String name, double weihgt) {
        super(name);
        this.weihgt = weihgt;
    }

    @Override
    public double calculateWeight() {
        return this.weihgt;
    }
}
