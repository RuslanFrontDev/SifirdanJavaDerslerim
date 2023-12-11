
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
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
public class ReentrantLockOrneyi {
// 1. ornekde Synchtpnize-nin daha rahat usulu ReentrantLock... ferqli  sayilar var

    /* private int sayi = 0;

    public void artir() {
        for (int i = 0; i < 10000; i++) {
            sayi++;
        }
    }

    public void thread1Func() {
        artir();
    }

    public void thread2Func() {
        artir();
    }

    public void threadOverFunc() {
        System.out.println("sayinin deyeri: " + sayi);
    }
     */
//    2. ornek ReentrantLock ile
    /*
    private int sayi = 0;
    private Lock lock = new ReentrantLock();

    public void artir() {
        for (int i = 0; i < 10000; i++) {
            sayi++;
        }
    }

    public void thread1Func() {
        lock.lock();
//        eger artir funksiyasinda Exception yeni xeta olarsa lock,unlock() calismaya biler.one gore try finally yazmaq lazim
        try {
            artir();

        } finally {
            lock.unlock();

        }
    }

    public void thread2Func() {
        lock.lock();
        try {
            artir();

        } finally {
            lock.unlock();

        }
    }

    public void threadOverFunc() {
        System.out.println("sayinin deyeri: " + sayi);
    }
     */
//    3. ornek Wait ve Notify-in daha rahat usulu Condition
    private int sayi = 0;
    private Lock lock = new ReentrantLock();
//     bu sekilde abstrack metod lazim oldugu ucun bele yazmiriq
//    private Condition condition = new Condition();
    private Condition condition = lock.newCondition();

    public void artir() {
        for (int i = 0; i < 10000; i++) {
            sayi++;
        }
    }

    public void thread1Func() {
        lock.lock();
//        eger artir funksiyasinda Exception yeni xeta olarsa lock,unlock() calismaya biler.one gore try finally yazmaq lazim
        System.out.println("Thread1 calisir");
        System.out.println("Thread1 thread2 isini bitirene qeder calismayacaq ");

        try {
            condition.await();
            System.out.println("Thread1 oyandi ve isini gorur");
            artir();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrneyi.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            lock.unlock();

        }
    }

    public void thread2Func() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrneyi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scan = new Scanner(System.in);
        lock.lock();

        try {
            System.out.println("Thread2 calisir");
            System.out.println("Thread2 calisir ve davam etmek ucun bir sey yazin");
            scan.nextLine();
            condition.signal();
            artir();

        } finally {
            lock.unlock();

        }
    }

    public void threadOverFunc() {
        System.out.println("sayinin deyeri: " + sayi);
    }
}
