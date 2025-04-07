package com.design.lldcraft.rate;

public class Rate {
    long maxRequest;
    long timeInMillis;

    public Rate(long maxRequest, long timeInMillis) {
        this.maxRequest = maxRequest;
        this.timeInMillis = timeInMillis;
    }
}
