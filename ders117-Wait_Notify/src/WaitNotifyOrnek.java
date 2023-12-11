
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class WaitNotifyOrnek {
// 1. ornek

    /*
public void thread1Func() {
//        burada WaitNotifyOrnek objesi uzerinden bir dene lock-a sahib olsun deye this yazdiq
        synchronized (this) {
            System.out.println("Thread 1 calisir");
            System.out.println("Thread 2 calismasini bitende thread1 oyanacaq");
            try {
//            this.wait(); her iki cure yazmaq olar
                wait();
                System.out.println("Oyandim rahatla uje");
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    public void thread2Func() {
        Scanner scan = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized (this) {
            System.out.println("Thread2 calisdi ve davam etmek ucun bir sey yaz");
            scan.nextLine();
            notify();
            System.out.println("Thread2 isini bitirdi artiq thread1 calisir");
        }
    }
     */
//    ****************************************************
//    2. ornek saniye ile
    /*
    public void thread1Func() {
//        burada WaitNotifyOrnek objesi uzerinden bir dene lock-a sahib olsun deye this yazdiq
        synchronized (this) {
            System.out.println("Thread 1 calisir");
            System.out.println("Thread 2 calismasini bitende thread1 oyanacaq");
            try {
//            this.wait(); her iki cure yazmaq olar
                wait();
                System.out.println("Oyandim rahatla uje");
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    ;
    public void thread2Func() {
        Scanner scan = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized (this) {
            System.out.println("Thread2 calisdi ve davam etmek ucun bir sey yaz");
            scan.nextLine();
            notify();
            System.out.println("Thread2 isini bitirdi artiq thread1 calisir ancaq 2 saniye sonra");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     */
//  3. ornek 2 lock istifade ederek
    
    private Object lock = new Object();

    public void thread1Func() {
//        burada WaitNotifyOrnek objesi uzerinden bir dene lock-a sahib olsun deye this yazdiq
        synchronized (lock) {
            System.out.println("Thread 1 calisir");
            System.out.println("Thread 2 calismasini bitende thread1 oyanacaq");
            try {
//            this.wait(); her iki cure yazmaq olar
                lock.wait();
                System.out.println("Oyandim rahatla uje");
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    ;
    public void thread2Func() {
        Scanner scan = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized (lock) {
            System.out.println("Thread2 calisdi ve davam etmek ucun bir sey yaz");
            scan.nextLine();
            lock.notify();
            System.out.println("Thread2 isini bitirdi artiq thread1 calisir ancaq 2 saniye sonra");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotifyOrnek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
