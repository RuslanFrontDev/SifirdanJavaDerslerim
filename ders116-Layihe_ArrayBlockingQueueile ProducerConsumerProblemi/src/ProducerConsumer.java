
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
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

    Random random = new Random();
//    ArrayBlockingQueue BlockingQueue deye bir dene interface-i implement edir
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void producer() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            Integer value = random.nextInt(100);
            System.out.println("Producer yazilir: " + value);
            try {
                queue.put(value);

            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void consumer() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Integer value = queue.take();
                System.out.println("consumer cixilir: " + value);
                System.out.println("Queue-nin size-i: " + queue.size());

            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


// ele bele ArrayList ile yoxladim

/*

import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {

    Random random = new Random();
//    ArrayBlockingQueue BlockingQueue deye bir dene interface-i implement edir
    ArrayList<Integer> queue = new ArrayList<Integer>(10);

    public void producer() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            Integer value = random.nextInt(100);
            System.out.println("Producer yazilir: " + value);
            queue.add(value);
        }
    }

    public void consumer() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            Integer value = queue.remove(0);
            System.out.println("consumer cixilir: " + value);
            System.out.println("Queue-nin size-i: " + queue.size());
        }
    }
}
*/