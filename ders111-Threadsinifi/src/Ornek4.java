
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
public class Ornek4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread basladi");
            try {
                System.out.println("Ornek4 calisir: " + (i+1));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Threadde fasile oldu");
            }
        }
    }

}
