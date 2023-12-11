
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
        System.out.println("Bir sayi yaz...");
        int input = scan.nextInt();
        int s1 = 0;
        int s2 = 1;
        int toplam;
        System.out.print(input + "Sayinin Fibonacci yazilisi->");
        for (int i = 1; i <= input; i++) {
            System.out.print(s1 + " , ");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}
