
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. orenk 1-den 100e qeder cut sayilari yaz
//        for (int a = 1; a < 100; a++) {
//            if (a % 2 == 1) {
//                continue;
//            }
//            System.out.println(a);
//        }
//        2.Negativ deyer(0 da daxil) girilene qeder istifadeciden Giris qebul et
//        int giris = 3;
//        int password = 123456;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Giris et");
//        while (true) {
//            int pass = scan.nextInt();
//
//            if (pass != password) {
//                giris -= 1;
//                System.out.println("girisiniz 1 vahid azaldi" + giris);
//
//            }
//            if (giris == 0) {
//                break;
//            }
//        }
//       3. ornek girilen sayiya qeder olan 2-nin quvvetleri
Scanner scan = new Scanner(System.in);
        System.out.println("Sayi yaz: ");
        int input = scan.nextInt();
        int a = 1;
        while(a <= input){
            System.out.println(a);
            a*=2;
        }
    }
}
