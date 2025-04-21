package org.example;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Tạo 3 thread
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 3; i++) {
                System.out.println("Thread1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 3; i++) {
                System.out.println("Thread2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 3; i++) {
                System.out.println("Thread3: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Sử dụng start()
        t1.start();
        t2.start();
        t3.start();
//
//        // Sử dụng run()
//        t1.run();
//        t2.run();
//        t3.run();
    }
}