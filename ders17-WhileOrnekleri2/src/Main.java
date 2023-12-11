
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
//    1.ornek  Faktoriyal hesablama 5->1*2*3*4*5 = 120
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Sayi yaz...");
//        int ilkinDeyer = 1;
//        int input = scan.nextInt();
//        while (input > 0) {
//            ilkinDeyer *= input;
//            input--;
//        }
//        System.out.println(ilkinDeyer);
//    2. ornek Harmonik sayilar 2+1/2+2/2......
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Reqem yaz");
//        double a = scan.nextInt();
//        double harmonic = 0.0;
//        while (a > 0) {
//            harmonic +=(1/a);
//            a--;
//        }
//        System.out.println(harmonic);
//    3. ornek Ulduzlar
//        Scanner scan = new Scanner(System.in);
//        int start = scan.nextInt();
//        int i = 1;
//        while (i <= start) {
//            int k = 1;
//
//            while (k <= i) {
//                System.out.print("*");
//                k++;
//
//            }
//            System.out.println("");
//            i++;
//        }
//     4. ORNEK Üstlü Sayı
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, ilkinDeyer = 1;
        System.out.println("reqem yaz...");
        sayi1 = scan.nextInt();
        System.out.println("Üstü yaz");
        sayi2 = scan.nextInt();
        int i = 1;
        while (i <= sayi2) {
            ilkinDeyer *= sayi1;
            i++;
        }
        System.out.println("cabvab..." + ilkinDeyer);
    }
}
