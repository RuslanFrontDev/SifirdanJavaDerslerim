
import java.io.IOException;
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

    public static void main(String[] args) throws IOException {
        System.out.print("Yasiniz?");
        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();
        /*try {
            zala_giris(yas);

        } catch (Exception e) {
            e.printStackTrace();
        }*/
//        QEYD!!! Eger try-catch ile yazmasaydiq 15. setirde throws yene yazilacaqdi
        zala_giris(yas);
        System.out.println("Calisiram");
    }

    public static void zala_giris(int yas) throws IOException {
        if (yas < 18) {
//            29. ve 30. UnCheckException
//            throw new ArithmeticException();
//           throw  new ArrayStoreException();
//            33. ChecedException oldugu zaman 27. setire de throws yazmaq lazim
            throw new IOException();
        } else {
            System.out.println("Zala xos geldiniz...");
        }
    }
}
