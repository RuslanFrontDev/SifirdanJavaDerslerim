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
//        153 = (1*1*1)+(5*5*5)+(3*3*3)
        int temp, birler, onlar, yuzler, toplam;
        for (int i = 100; i <= 999; i++) {
            temp = i;
            birler = temp % 10;
            temp /= 10;
            onlar = temp % 10;
            temp /= 10;
            yuzler = temp % 10;
            temp /= 10;
            toplam = (birler * birler * birler) + (yuzler * yuzler * yuzler) + (onlar * onlar * onlar);
            if (toplam == i) {
                System.out.println(i + "Armstrongdur");
            }

        }
    }
}
