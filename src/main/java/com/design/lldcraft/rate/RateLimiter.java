package com.design.lldcraft.rate;

import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {
    ConcurrentHashMap<String, UserRateLimit> userRateLimitMap;
    Rate rate;

    public RateLimiter(long maxRequest, long maxTime) {
        this.userRateLimitMap = new ConcurrentHashMap<>();
        this.rate = new Rate(maxRequest, maxTime);
    }

    public boolean allowRequest(String userId) {
        UserRateLimit userRateLimit = userRateLimitMap.computeIfAbsent(userId , k -> new UserRateLimit());
        return userRateLimit.allow(rate);
    }

}
