package com.design.lldcraft.rate;

public interface RateAlgorithm {
    boolean allow(Rate rate, UserRateLimit userRateLimit);
}
