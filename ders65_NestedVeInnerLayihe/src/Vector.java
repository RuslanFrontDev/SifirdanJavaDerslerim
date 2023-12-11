
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class Vector {

    private String ad;
    private int i;
    private int j;
    private int k;

    public Vector(String ad) {
        this.ad = ad;
        Scanner scan = new Scanner(System.in);
        System.out.println(ad + " i, j ve k deyerlerini yazin...");
        System.out.print("i: ");
        this.i = scan.nextInt();
        System.out.print("j: ");
        this.j = scan.nextInt();
        System.out.print("k: ");
        this.k = scan.nextInt();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

}
