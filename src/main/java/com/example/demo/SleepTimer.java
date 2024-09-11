package com.example.demo;

import static java.lang.Thread.sleep;

public class SleepTimer {
    static void start(int mseconds) {
        try {
            sleep(mseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
