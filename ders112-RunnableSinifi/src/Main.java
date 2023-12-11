/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Main {
//    1. ornek
/*    public static void main(String[] args) {
        Thread th = new Thread(new ThreadRunnableOrneyi("Name1"));
        th.start();
        Thread th2 = new Thread(new ThreadRunnableOrneyi("Name2"));
        th2.start();
        
    }
     */
//    2. ornek Anonim class kimi
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            String name = "Ruslan";

            @Override
            public void run() {
                System.out.println("Thread basladi");
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(name + " Yazilir: " + (i + 1));
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Threadde fasile oldu");
                    }
                }
            }
        });
        th.start();
//        3. ornek Anonim class-nin özünü yazdırmaq
        new Thread(new Runnable() {
            String name = "Ruslan";

            @Override
            public void run() {
                System.out.println("Thread basladi");
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(name + " Yazilir: " + (i + 1));
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Threadde fasile oldu");
                    }
                }
            }
        }).start();
        System.out.println("Main thread Calisir");
    }

}
