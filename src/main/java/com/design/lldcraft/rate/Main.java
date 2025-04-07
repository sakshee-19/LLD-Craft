package com.design.lldcraft.rate;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        RateLimiter rateLimiter = new RateLimiter(3, 1000);

        Random random = new Random();
        String[] userIds = {"user1", "user2", "user3"};
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                for (int j = 0; j < 20; j++) {

                    String userId = userIds[random.nextInt(userIds.length)];
                    boolean allowed = rateLimiter.allowRequest(userId);
                    System.out.println(Thread.currentThread().getName() + " - User: " + userId + " -> " + (allowed ? "Allowed ✅" : "Denied ❌"));
                    try {
                        Thread.sleep(random.nextInt(800)); // simulate some delay
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }
    }
}
