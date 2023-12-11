
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
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
public class ProducerConsumer {

    /*
    burada iki  lock.notify(); yazmamızın səbəbi odur ki, her iki metod bir-birlerini
    gözləyib çalışmalıdır. çünki birində if (queue.size() == limit) bu şəkildə yazıb
    gözlədik, digərində isə if (queue.size() == 0) o olduğunda gözlətdik 
     */
    Random random = new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<>();
    private int limit = 10;

    public void producer() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized (lock) {
                if (queue.size() == limit) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producerler yazilir:" + value);
                lock.notify();

            }
        }
    }

    ;
    
    public void consumer() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized (lock) {
                if (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                Integer value = queue.poll();
                System.out.println("Consumer Cixilir: " + value);
                System.out.println("Queue Size: " + queue.size());
                lock.notify();

            }
        }
    }
}
