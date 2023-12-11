
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
        Scanner scan = new Scanner(System.in);
        int input;
        boolean asal = true;
        do {
            System.out.println("2den yuxari sayi yaz");
            input = scan.nextInt();
        } while (input < 2);
        for (int i = 2; i < input; i++) {
            if (input % 2 == 0) {
                asal = false;
                break;
            }
        }
        if (asal) {
            System.out.println( input+"Sayimiz asal");
        } else {
            System.out.println( input+"Sayimiz asal deyil");
        }
    }
}
