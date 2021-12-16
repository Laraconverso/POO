package com.company;

import com.company.core.CargoShip;
import com.company.core.payloads.Payload;
import com.company.core.payloads.PayloadCodeException;
import com.company.core.payloads.PayloadFactory;
import com.company.core.payloads.SimplePayload;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        try {
            Payload tv = PayloadFactory.createSimplePayload("TV 32' LCD", 3, "SLW-123");
            Payload medicines = PayloadFactory.createSimplePayload("Caja de medicamentos", 2, "FST-456");
            Set<SimplePayload> payloads = new HashSet<>();
            payloads.add((SimplePayload) tv);
            payloads.add((SimplePayload) medicines);
            Payload container = PayloadFactory.createContainerPayload("Contenedor", payloads);
            CargoShip boat = new CargoShip();
            boat.addPayload(tv);
            boat.addPayload(medicines);
            boat.addPayload(container);
            boat.showPayloads();
        } catch (PayloadCodeException error) {
            System.out.println(error);
        }
    }
}
