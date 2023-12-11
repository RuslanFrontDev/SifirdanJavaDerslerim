
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
/*

public class Main {

    public static void zala_giris(int yas) {
        if (yas < 18) {
            throw new AgeException("Yasiniz Kicikdir");
        } else {
            System.out.println("Mekana gire bildiniz");
        }
    }

    public static void main(String[] args) {
        System.out.print("Yasiniz girin: ");
        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();
        try {
            zala_giris(yas);

        } catch (Exception e) {
//            1. ornek
//            e.printStackTrace();
//            2. ornek
//            System.out.println(e);
        }
    }
}

*/
//3. ornek Throws ile yazmaq
/*public class Main {

    public static void zala_giris(int yas) {
        if (yas < 18) {
            throw new AgeException("Yasiniz Kicikdir");
        } else {
            System.out.println("Mekana gire bildiniz");
        }
    }

    public static void main(String[] args) {
        System.out.print("Yasiniz girin: ");
        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();
        zala_giris(yas);

    }
}*/
//4. ornek Checked exception-dan toretmek
public class Main {

    public static void zala_giris(int yas) throws AgeException {
        if (yas < 18) {
            throw new AgeException("Yasiniz Kicikdir");
        } else {
            System.out.println("Mekana gire bildiniz");
        }
    }

    public static void main(String[] args) throws AgeException {
        System.out.print("Yasiniz girin: ");
        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();
//        try-catch ile de yazmaq olar ve ya 67. setirde throw firlatmaqla da 82. setirdeki kimi de yaza bilerik
        /*
        try {
            zala_giris(yas);

        } catch (AgeException e) {
//            1. ornek
//            e.printStackTrace();
//            2. ornek
            System.out.println(e);
        }*/
        zala_giris(yas);

    }
}