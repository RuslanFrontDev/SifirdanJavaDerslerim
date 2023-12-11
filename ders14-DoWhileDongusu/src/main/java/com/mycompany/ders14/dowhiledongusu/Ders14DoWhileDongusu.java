/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ders14.dowhiledongusu;

import java.util.Scanner;

/**
 *
 * @author Nurlan Rustamov
 */
public class Ders14DoWhileDongusu {

    public static void main(String[] args) {
//        int a = 5;
//        do {            
//            System.out.println("Yazdi");
//            a++;
//        } while (a<5);
//     2. ornek
        Scanner scan = new Scanner(System.in);
        int a;
        do {
            System.out.println("sayi yaz");
            a = scan.nextInt();
        } while (a < 5);
    }
}
