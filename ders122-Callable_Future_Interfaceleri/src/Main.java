
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
public class Main {

    public static void main(String[] args) {
//  bu gune qeder run metodunnan bir deyer dondure bilmirdik. ancaq Callable ile bunu edeceyik
//    1. ornek  
/*
ExecutorService ex = Executors.newFixedThreadPool(1); //eyni anda 1 dene thread istifade edilir
        ex.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    System.out.println("Thread calisir...");
                    int vaxt = random.nextInt(1000) + 2000;
                    Thread.sleep(vaxt);
                    System.out.println("Thread sonlandi...");
                } catch (InterruptedException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }

            }

        });
        ex.shutdown();
         */
//***************************************************************
//  2. ornek Callable ile. ancaq bu yazida hele de deyeri ala bilmemisik
/*
        ExecutorService ex = Executors.newFixedThreadPool(1); //eyni anda 1 dene thread istifade edilir
        ex.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread calisir...");
                int vaxt = random.nextInt(1000) + 2000;
                try {
                    Thread.sleep(vaxt);
                    System.out.println("Thread sonlandi...");
                } catch (InterruptedException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }
                return vaxt;

            }

        });
        ex.shutdown();
         */
//*******************************************************
//   3. orenk geriye deyeri bir deyiskene atsaq nece? Burada da 4. ornekde Future interface-nen referans isteyir
/*
     ExecutorService ex = Executors.newFixedThreadPool(1); //eyni anda 1 dene thread istifade edilir
      Integer i = ex.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread calisir...");
                int vaxt = random.nextInt(1000) + 2000;
                try {
                    Thread.sleep(vaxt);
                    System.out.println("Thread sonlandi...");
                } catch (InterruptedException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }
                return vaxt;

            }

        });
        ex.shutdown();
         */
// *************************************************************
//4. ornek Future Interface
/*      
ExecutorService ex = Executors.newFixedThreadPool(1); //eyni anda 1 dene thread istifade edilir
        Future<Integer> future = ex.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread calisir...");
                int vaxt = random.nextInt(1000) + 2000;
                try {
                    Thread.sleep(vaxt);
                    System.out.println("Thread sonlandi...");
                } catch (InterruptedException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }
                return vaxt;

            }

        });
        ex.shutdown();
        try {
            System.out.println("Deyeriniz: " + future.get());
        } catch (InterruptedException ex1) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (ExecutionException ex1) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
        }
         */
//  *****************************************************************
//5. ornek eger bir Exception firlatsaq
/*      
ExecutorService ex = Executors.newFixedThreadPool(1); //eyni anda 1 dene thread istifade edilir
        Future<Integer> future = ex.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread calisir...");
                int vaxt = random.nextInt(1000) + 2000;
                if(vaxt > 2500){
                  throw new IOException("Thread-in vaxti 2500-i asdi");
                }
                System.out.println("Nolsun ki vaxt 2500-u asdi. Men calisiram ama(:/)");
                try {
                    Thread.sleep(vaxt);
                    System.out.println("Thread sonlandi...");
                } catch (InterruptedException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }
                return vaxt;

            }

        });
        ex.shutdown();
        try {
            System.out.println("Deyeriniz: " + future.get());
        } catch (InterruptedException ex1) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (ExecutionException ex1) {
            System.out.println(ex1);
            
        }
         */
//******************************************************
//6. ornek Hansi tipden bağlı olmadığını yazmaq üçün
        ExecutorService ex = Executors.newFixedThreadPool(1); //eyni anda 1 dene thread istifade edilir
        Future<?> future = ex.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread calisir...");
                int vaxt = random.nextInt(1000) + 2000;
                if (vaxt > 2500) {
                    throw new IOException("Thread-in vaxti 2500-i asdi");
                }
                System.out.println("Nolsun ki vaxt 2500-u asdi. Men calisiram ama(:/)");
                try {
                    Thread.sleep(vaxt);
                    System.out.println("Thread sonlandi...");
                } catch (InterruptedException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }
                return vaxt;

            }

        });
        ex.shutdown();
        try {
            System.out.println("Deyeriniz: " + future.get());
        } catch (InterruptedException ex1) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (ExecutionException ex1) {
            System.out.println(ex1);

        }
    }

}
