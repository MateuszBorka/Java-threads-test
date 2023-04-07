package org.example;

import java.awt.*;

public class Runner implements Runnable{

    private String name;
    private int distance;
    private int progress;

    public Runner(String name, int distance){
        this.name = name;
        this.distance = distance;
        this.progress = 0;
    }

    public void run() {
        while(progress < distance){

            int step = (int) (Math.random() * 3) + 1;
            progress += step;

            System.out.printf("%s: %d/%d\n", name, progress, distance);

            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.err.println("Interrupted while waiting to move\n");
                e.printStackTrace();
            }
        }
        System.out.printf("%s had finished\n", name);
    }
}
