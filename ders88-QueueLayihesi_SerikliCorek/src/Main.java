
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
          // 80-ci iller Şərikli Çörək Uyğulaması
    
    // Sobadan 1(daxil) ilə 10(daxil) arası Çörək çıxacaq. Quyruqdakılar Çörəyi almağa çalışacaq.
   
     System.out.println("Serikli corek Uygulamasi....");
        Random random = new Random();
        
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        pide_kuyrugu.offer("Ruslan");
        pide_kuyrugu.offer("Eli");
        pide_kuyrugu.offer("Veli");
        pide_kuyrugu.offer("Azer");
        pide_kuyrugu.offer("Nurlan");
        pide_kuyrugu.offer("Behruz");
        pide_kuyrugu.offer("Aysel");
        pide_kuyrugu.offer("Turkan");
        pide_kuyrugu.offer("Polat");
        pide_kuyrugu.offer("Elif"); 
        
        int corek_sayisi = 1 + random.nextInt(10);
        System.out.println("Corekler cixir...");
        System.out.println("cixan corek sayisi : " + corek_sayisi);
        Thread.sleep(3000);
        
        while (corek_sayisi != 0) {
            
            System.out.println(pide_kuyrugu.poll() + " corek aldi...");
            corek_sayisi--;
            Thread.sleep(1000);
            
        }
        
        System.out.println("Corek qalmadi...");
    }
}
