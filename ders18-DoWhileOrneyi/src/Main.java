
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
        int input, toplam = 0;
        do {
            System.out.println("Sayi yaz...");
            input = scan.nextInt();
            if (input % 2 == 0) {

                toplam += input;
            }
        } while (input > 0);
        System.out.println(toplam);
    }
}
