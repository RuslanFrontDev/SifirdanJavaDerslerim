
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
        int mebleq = 1000, input, miqdar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kapital Banka Xos Geldiniz...");
        System.out.println("Sizin Meqleqde->" + mebleq + "Azn pulunuz var");
        while (mebleq > 0) {
            System.out.println("1. islem-->> Pul Kocurtmek");
            System.out.println("2. islem-->> Pul Cekmek");
            System.out.println("3. islem-->> Guncel Meblegimiz");
            System.out.println("4. islem-->> Cixis et ");
            System.out.println(" islem-->> Islem Sec..");
            input = scan.nextInt();
            if (input == 1) {
                System.out.println("ne qeder pul yatirmaq isteyirsiniz?");
                miqdar = scan.nextInt();
                mebleq += miqdar;
            } else if (input == 2) {
                System.out.println("ne qeder pul cekmek isteyirsiniz?");
                miqdar = scan.nextInt();
                if (miqdar > mebleq) {
                    System.out.println("Yetersiz meqleq");
                } else {
                    mebleq -= miqdar;
                }
            } else if (input == 3) {
                System.out.println("YEkun Mebleqiniz" + mebleq);
            } else if (input == 4) {
                System.out.println("cixis edilir");
                break;
            } else {
                System.out.println("gecersiz islem");
            }

        }
    }
}
