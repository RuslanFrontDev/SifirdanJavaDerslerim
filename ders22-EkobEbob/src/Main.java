
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
        int s1, s2, ebob = 1, ekob;
        System.out.println("Sayi yazin...");
        System.out.print("1. sayi...");
        s1 = scan.nextInt();
        System.out.println("");
        System.out.print("2. sayi...");
        s2 = scan.nextInt();
        int min = (s1 < s2) ? s1 : s2;
        for (int i = min; i > 0; i--) {
            if ((s1%i==0)&& (s2%i == 0)) {
                ebob = i;
                break;
            }
        }
        ekob = (s1*s2)/ebob;
        System.out.println(s1+"ve"+s2+"sayilarinin ekobu"+ekob);
        System.out.println(s1+"ve"+s2+"sayilarinin ebobu"+ebob);
    }
}
