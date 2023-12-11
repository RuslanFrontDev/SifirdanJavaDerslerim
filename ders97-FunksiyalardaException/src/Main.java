/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Main {
//    1.ornek

    public static void ucuncuFunc() {

        int a = 30 / 0;
    }

    public static void ikinciFunc() {
        try {
            ucuncuFunc();

        } catch (Exception e) {
            System.out.println("0-a bolme yanlis");
        }
    }

    public static void birinciFunc() {
        ikinciFunc();
        
    }

    public static void main(String[] args) {
//        1. ornek try-catch-i ucuncu funksiyada yazmaq 
       /* birinciFunc();
        System.out.println("xeta var ama calisiram");*/
//        2. ornek try-catch-i ikinci funksiyada yazmaq 
        birinciFunc();
        System.out.println("xeta var ama calisiram");
    }
}
