
import java.util.LinkedList;
import java.util.List;
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
public class Mainn {

    /*
    Interrupt Exception bir Thread-in çalışmasını bitirmir. Sadəcə o Thread-ı yarıda kəsir.
    Misal thread gözləmədədisə o thread-ı gözlədiyi yerdən çıxardıb çalışdırır. burada try-catch
    exception olduğu halda belə proqramı sonlandırmadı. yenidən qaldığı yerdən davam etdi
     */
//    1. ornek
    public static void main(String[] args) {
        /*
        Thread t;
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Calisir..");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread yazir: " + i);

                    try {
                        Thread.sleep(1000);
                        System.out.println("Yuxumun: " + i + "-inci saniyesindeyik");
                    } catch (InterruptedException ex) {// yarida kesmek istesek
                        System.out.println("Meni yarida oyandirdiniz!!!");
                    }
                }

            }
        });
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.interrupt();// thread-i yarida kesdiyimizi deyirik
         */
//    2. ornek Belli bir interrupt oldugu halda thread-in calismasini tamamile sonlardirmaq
        List<Integer> list = new LinkedList<>();

        Thread t;
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Calisir..");
                for (int i = 0; i < 10000000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread yarida kesildi: ");
                        return; // sonlandirdiq

                    }
                    list.add(i);

                }
                System.out.println("Thread yarida kesilmeden isini bitirdi");

            }
        });
        t.start();
        try {
//     burada internet suretine gore ele ola biler ki tez yuklensin misal(2000 saniye)
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.interrupt();// thread-i yarida kesdiyimizi deyirik

    }
}
