package com.company.core.payloads;

import java.util.Set;

public class ContainerPayload extends Payload {
    private Set<SimplePayload> payloads;
    private final static int WEIGHT_CONTAINER = 100;

    public ContainerPayload(String name, Set<SimplePayload> payloads) {
        super(name);
        this.payloads = payloads;
    }

    @Override
    public double calculateWeight() {
        double totalWeight = 0;
        for (SimplePayload payload: this.payloads) {
            totalWeight += payload.calculateWeight();
        }
        return totalWeight + WEIGHT_CONTAINER;
    }
}
