/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Main {
//  1. ornek main metodu birinci calisdigina gore 0 deyeri geldi

    /*  private int count = 0;

    public void threadlariCalisdir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    count++;
                }
            }
        });
        Thread thread2;
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    count++;
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("count deyiskenin deyeri: " + count);
    }

    public static void main(String[] args) {
        Main threadsafe = new Main();
        threadsafe.threadlariCalisdir();
    }
     */
//    ****************************************************
//    2. ornek Join metodu ile Threadlari gozletdik ancaq ferqli deyerler geldi
    /*  private int count = 0;

    public void threadlariCalisdir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    count++;
                }
            }
        });
        Thread thread2;
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    count++;
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException ex) {
            System.out.println("");
        }
        System.out.println("count deyiskenin deyeri: " + count);
    }

    public static void main(String[] args) {
        Main threadsafe = new Main();
        threadsafe.threadlariCalisdir();
    }
     */
//    3. ornek synchronized
    private int count = 0;

    public synchronized void countArtir() {
        count++;
    }

    ;

    public void threadlariCalisdir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    countArtir();
                }
            }
        });
        Thread thread2;
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    countArtir();
                }
            }
        });
        long baslangic = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException ex) {
            System.out.println("");
        }
        long bitis = System.currentTimeMillis();
        System.out.println("count deyiskenin deyeri: " + count);
        System.out.println("zaman: " + (bitis - baslangic) / 1000);
    }

    public static void main(String[] args) {
        Main threadsafe = new Main();
        threadsafe.threadlariCalisdir();
    }
}
