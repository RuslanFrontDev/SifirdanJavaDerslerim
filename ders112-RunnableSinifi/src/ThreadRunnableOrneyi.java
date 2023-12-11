/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class ThreadRunnableOrneyi implements Runnable {

    private String name;

    public ThreadRunnableOrneyi(String name) {
        this.name = name;

    }

    public void threadOrneyiRunnable() {
        System.out.println(name +" basladi");

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(name + " Yazilir: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Threadde fasile oldu");
            }
        }
    }

    @Override
    public void run() {
        threadOrneyiRunnable();
    }

}
