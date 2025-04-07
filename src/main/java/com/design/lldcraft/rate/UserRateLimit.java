package com.design.lldcraft.rate;

import java.util.concurrent.locks.ReentrantLock;

public class UserRateLimit {
//    Deque<Long> requestTimeLogs;
    int requestCount;
    long windowStart;
    ReentrantLock lock;
    public UserRateLimit() {
//        requestTimeLogs = new LinkedList<>();
        lock = new ReentrantLock();
    }

    public boolean allow(Rate rate){
        lock.lock();
        try {
            long currentTimeInMillis = System.currentTimeMillis();
            if(windowStart <= currentTimeInMillis - rate.timeInMillis){
                requestCount = 1;
                windowStart = currentTimeInMillis;
                return true;
            } else {
                if(requestCount < rate.maxRequest){
                    requestCount++;
                    return true;
                }
                return false;
            }
        } finally {
            lock.unlock();
        }
    }
}
