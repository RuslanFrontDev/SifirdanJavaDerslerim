
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class DeadLockOrnekClass {

    private Bank bank1 = new Bank();
    private Bank bank2 = new Bank();
    private Random random = new Random();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
//    1. ornekde hec vaxt 20000 deyerini ala bilmiyeceyik
/*
    public void thread1Func() {
        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank1, bank2, random.nextInt(100));
        }

    };
    
    public void thread2Func() {
        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank2, bank1, random.nextInt(100));
        }
    };

    public void threadOver() {
        System.out.println("Bank1-deki Pullar: " + bank1.getPulunuz() + " Bank2-deki Pullar: " + bank2.getPulunuz());
        System.out.println("Toplam pulunuz: " + (bank1.getPulunuz() + bank2.getPulunuz()));
    }
     */
//    ***************************************************************
//2. ornekde dogru sayi geldi. ancaq 3 ornekdeki kimi thread2-de evvel lock2 sonra lock1 yazsaq deadlock yaranacaq
    /*
    public void thread1Func() {
        
   // burada iki  lock1.lock();  lock2.lock(); yazmamızın səbəbi odur ki, her iki metod
  //  bir-birlerini gözləyib çalışmalıdır. 
         
        lock1.lock();
        lock2.lock();

        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank1, bank2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();

    }

    ;
    
    public void thread2Func() {
        lock1.lock();
        lock2.lock();
        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank2, bank1, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    ;

    public void threadOver() {
        System.out.println("Bank1-deki Pullar: " + bank1.getPulunuz() + " Bank2-deki Pullar: " + bank2.getPulunuz());
        System.out.println("Toplam pulunuz: " + (bank1.getPulunuz() + bank2.getPulunuz()));
    }
     */
//    ***********************************************
//    3. ornek yer deyisme
    /* 
public void thread1Func() {
        
   // burada iki  lock1.lock();  lock2.lock(); yazmamızın səbəbi odur ki, her iki metod
  //  bir-birlerini gözləyib çalışmalıdır. 
         
        lock1.lock();
        lock2.lock();

        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank1, bank2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();

    }

    ;
    
    public void thread2Func() {
        lock2.lock();
        lock1.lock();
        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank2, bank1, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    ;

    public void threadOver() {
        System.out.println("Bank1-deki Pullar: " + bank1.getPulunuz() + " Bank2-deki Pullar: " + bank2.getPulunuz());
        System.out.println("Toplam pulunuz: " + (bank1.getPulunuz() + bank2.getPulunuz()));
    }
     */
//    ***********************************************************
//    4. ornek locklari kontrol etmek
    private void LocklarKontrolda(Lock a, Lock b) {
        boolean a_elde_edildi = false;
        boolean b_elde_edildi = false;
        while (true) {
            a_elde_edildi = a.tryLock();
            b_elde_edildi = b.tryLock();
            if (a_elde_edildi == true && b_elde_edildi == true) {
                return;
            }
            if (a_elde_edildi == true) {
                a.unlock();
            }
            if (b_elde_edildi == true) {
                b.unlock();
            }
        }
    }

    public void thread1Func() {
        LocklarKontrolda(lock1, lock2);
        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank1, bank2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();

    }

    ;
    
    public void thread2Func() {
         LocklarKontrolda(lock2, lock1);
        for (int i = 0; i < 5000; i++) {
            Bank.pulTansferi(bank2, bank1, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();

    }

    ;

    public void threadOver() {
        System.out.println("Bank1-deki Pullar: " + bank1.getPulunuz() + " Bank2-deki Pullar: " + bank2.getPulunuz());
        System.out.println("Toplam pulunuz: " + (bank1.getPulunuz() + bank2.getPulunuz()));
    }
}
