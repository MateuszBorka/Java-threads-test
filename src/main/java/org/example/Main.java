package org.example;


public class Main {
    public static void main(String[] args) {
        Runner runner1 = new Runner("Runner 1", 100);
        Runner runner2 = new Runner("Runner 2", 100);
        Runner runner3 = new Runner("Runner 3", 100);

        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
