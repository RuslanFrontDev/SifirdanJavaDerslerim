
/*
import java.util.logging.Level;
import java.util.logging.Logger;*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Worker("ruslan", 1));
        Thread thread2 = new Thread(new Worker("eli", 2));
        Thread thread3 = new Thread(new Worker("veli", 3));
        Thread thread4 = new Thread(new Worker("tofiq", 4));
        Thread thread5 = new Thread(new Worker("abbas", 5));
        ExecutorService executor = Executors.newFixedThreadPool(2);
            executor.submit(thread1);
            executor.submit(thread2);
            executor.submit(thread3);
            executor.submit(thread4);
            executor.submit(thread5);
        System.out.println("butun isler teslim edildi");

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);

          
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("butun isler bitdi");
    }
}



  /*Thread thread1 = new Thread(new Worker("ruslan", 1));
            Thread thread2 = new Thread(new Worker("eli", 2));
            Thread thread3 = new Thread(new Worker("veli", 3));
            Thread thread4 = new Thread(new Worker("tofiq", 4));
            Thread thread5 = new Thread(new Worker("abbas", 5));
            System.out.println("isler teslim edildi");
            thread1.start();
            thread2.start();
            try {
            thread1.join();
            thread2.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            thread3.start();
            thread4.start();
            try {
            thread3.join();
            thread4.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            thread5.start();
            try {
            thread5.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Butun isler tamamlandi");*/