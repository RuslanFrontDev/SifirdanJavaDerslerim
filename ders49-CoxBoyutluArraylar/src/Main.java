
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

    public static Kart kartlar[][] = new Kart[4][4];

    public static void main(String[] args) {
        kartlar[0][0] = new Kart('R');
        kartlar[0][1] = new Kart('G');
        kartlar[0][2] = new Kart('C');
        kartlar[0][3] = new Kart('A');
        kartlar[1][0] = new Kart('C');
        kartlar[1][1] = new Kart('G');
        kartlar[1][2] = new Kart('Z');
        kartlar[1][3] = new Kart('D');
        kartlar[2][0] = new Kart('N');
        kartlar[2][1] = new Kart('N');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('Z');
        kartlar[3][0] = new Kart('A');
        kartlar[3][1] = new Kart('U');
        kartlar[3][2] = new Kart('U');
        kartlar[3][3] = new Kart('R');
//        oyunLovhesi();
        while (oyunbitdimi() == false) {
            oyunLovhesi();
            texminEt();
        }
    }

    static void texminEt() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1 Texmin=>> i ve j deyerlerini Yazin...");
        int i1 = scan.nextInt();
        int j1 = scan.nextInt();
        kartlar[i1][j1].setTexmin(true);
        oyunLovhesi();
        System.out.print("2. Texmin=>> i ve j deyerlerini Yazin...");
        int i2 = scan.nextInt();
        int j2 = scan.nextInt();
        if (kartlar[i1][j1].getHerf() == kartlar[i2][j2].getHerf()) {
            System.out.println("Dogru texmin");
            kartlar[i2][j2].setTexmin(true);
        } else {
            System.out.println("Yanlis texmin");
            kartlar[i1][j1].setTexmin(false);
            
        }
    }

    public static boolean oyunbitdimi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTexmin() == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void oyunLovhesi() {
        for (int i = 0; i < 4; i++) {
            System.out.println("___________________");
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTexmin()) {
                    System.out.print(" |" + kartlar[i][j].getHerf() + "| ");
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
            System.out.println("-------------------");
        }
    }
}
