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
//        1. ornek
//        Sinif1 sinif1 = new Sinif1();
//        Sinif2 sinif2 = new Sinif2();
//        System.out.println(sinif1 == sinif2);
//        2. ornek
//        Sinif1 sinif1 = new Sinif1();
//        Sinif2 sinif2 = sinif1;
//        3. ornek
        Sinif1 sinif1 = new Sinif1();
        Sinif1 muqayise = sinif1;
        Sinif1 sinif2 = new Sinif1();
        System.out.println(sinif1 == muqayise);
        System.out.println(sinif1 == sinif2);
        if (sinif1 == muqayise) {
            System.out.println("=");
        } else {
            System.out.println("/=/");
        }
        if (sinif1 == sinif2) {
            System.out.println("=");
        } else {
            System.out.println("/=/");
        }

    }
}
