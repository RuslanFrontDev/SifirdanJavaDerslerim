
import java.util.Scanner;

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
//   1. ornek Asal sayilar
//        for (int i = 2; i < 1000; i++) {
//            if (asal(i)) {
//                System.out.println("asaldir->" + i);
//            }
//        }
//   2. ornek Ebob
//        Scanner scan = new Scanner(System.in);
//        System.out.print("1. sayi->");
//        int a = scan.nextInt();
//        System.out.print("2. sayi->");
//        int b = scan.nextInt();
//        System.out.println("Ebob=>" + ebob(a, b));
//   3. ornek hesablama
        double a = 2, b = 10, c = 5, d = 50;
        toplama(a,b);
        cixma(c);
        cixma(c, d);
        vurma(d, b);
        bolme(a, c);
    }

    //1. ornek
//    static boolean asal(int sayi) {
//        for (int i = 2; i < sayi; i++) {
//            if (sayi % i == 0) {
//                return false;
//            }
//
//        }
//        return true;
//    }
    //2. ornek
//    static int ebob(int sayi1, int sayi2) {
//        int ebob = 1;
//
//        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
//            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
//                ebob = i;
//            }
//
//        }
//        return ebob;
//    }
//    3. ornek
        static void toplama(double a, double b){
            System.out.println("Toplama=>"+(a + b));
         }
        static void cixma(double c){
            System.out.println("Cixma=>"+( c - 5));
         }
        static void cixma(double c, double d){
            System.out.println("Cixma=>"+(c - d));
         }
        static void vurma(double d, double b){
            System.out.println("Vurma=>"+(d * b));
         }
        static void bolme(double a, double c){
            System.out.println("Bolme=>"+(a / c));
         }
}
