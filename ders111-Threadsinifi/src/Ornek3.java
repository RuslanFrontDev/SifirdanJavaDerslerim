/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Ornek3 extends Thread {

    private int sayi;
    private String ad;

    public Ornek3(int sayi, String ad) {
        this.sayi = sayi;
        this.ad = ad;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(ad);
        }
    }

}
