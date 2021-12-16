package com.company.core;

import com.company.core.payloads.Payload;

import java.util.HashSet;
import java.util.Set;

public class CargoShip {
    private Set<Payload> payloads;

    public CargoShip() {
        this.payloads = new HashSet<>();
    }

    public void addPayload(Payload payload) {
        this.payloads.add(payload);
    }

    public void showPayloads() {
        for (Payload payload: this.payloads) {
            System.out.println(payload);
        }
    }
}
