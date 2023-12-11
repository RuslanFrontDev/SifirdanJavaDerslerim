
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
        System.out.print("Yasiniz?");
        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();
//        Xetamizi burada try-catch ile yaza bilerik
        try {
            zala_giris(yas);

        } catch (Exception e) {
            System.out.println("Yasiniz 18-den kicikdir");
        }
        System.out.println("xeta var ama calisiram");
    }

    public static void zala_giris(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();
//           throw  new ArrayStoreException();
        } else {
            System.out.println("Zala xos geldiniz...");
        }
    }
}
