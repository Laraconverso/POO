package com.company.core.payloads;

import java.util.Set;

public class PayloadFactory {
    public final static String SLOW_PAYLOAD_CODE = "SLW-123";
    public final static String FAST_PAYLOAD_CODE = "FST-456";
    public final static double SLOW_PAYLOAD_VARIANCE = 1.1;
    public final static double FAST_PAYLOAD_VARIANCE = 1.1;

    public static Payload createSimplePayload(String name, double weight, String code) throws PayloadCodeException {
        double finalWeight = calculateFinalWeight(weight, code);
        return new SimplePayload(name, finalWeight);
    }

    public static Payload createContainerPayload(String name, Set<SimplePayload> payloads) {
        return new ContainerPayload(name, payloads);
    }

    private static double calculateFinalWeight(double weight, String code) throws PayloadCodeException {
        double finalWeight = weight;
        if (code.equals(SLOW_PAYLOAD_CODE)) {
            finalWeight *= SLOW_PAYLOAD_VARIANCE;
        } else if (code.equals(FAST_PAYLOAD_CODE)) {
            finalWeight /= FAST_PAYLOAD_VARIANCE;
        } else {
            throw new PayloadCodeException();
        }
        return finalWeight;
    }
}
