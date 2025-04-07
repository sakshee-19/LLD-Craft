package com.design.lldcraft.rate;//package practice.lld.rate;
//
//import java.util.Deque;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class UserTokenRateLimit {
//    Deque<Long> requestTimeLogs;
//    long windowStart;
//    ReentrantLock lock;
//    public UserTokenRateLimit() {
////        requestTimeLogs = new LinkedList<>();
//        lock = new ReentrantLock();
//    }
//
//    public boolean allow(Rate rate){
//        lock.lock();
//        try {
//            long currentTimeInMillis = System.currentTimeMillis();
//
//
//
//        } finally {
//            lock.unlock();
//        }
//    }
//}
