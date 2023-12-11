/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Idman {

    private int burpe_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpe_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpe_sayisi = burpe_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpe_sayisi() {
        return burpe_sayisi;
    }

    public void setBurpe_sayisi(int burpe_sayisi) {
        this.burpe_sayisi = burpe_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hereketeBasla(String hereketNovu, int sayi) {
        if (hereketNovu.equals("Burpee")) {
            burpeeEt(sayi);
        } else if (hereketNovu.equals("Pushup")) {
            pushupEt(sayi);
        } else if (hereketNovu.equals("Situp")) {
            situpEt(sayi);
        } else if (hereketNovu.equals("Squat")) {
            squatEt(sayi);
        } else {
            System.out.println("Kecersiz hereket");
        }
    }

    public void burpeeEt(int sayi) {
        if (burpe_sayisi == 0) {
            System.out.println("Edilecek Burpee qalmadi");
        }
        if (burpe_sayisi - sayi < 0) {
            System.out.println("Burpe sayisini kecdiniz");
            burpe_sayisi = 0;
            System.out.println("Qalan burpee sayisi" + burpe_sayisi);
        } else {
            burpe_sayisi -= sayi;
            System.out.println("Qalan burpee sayisi" + burpe_sayisi);
        }

    }

    public void pushupEt(int sayi) {
        if (pushup_sayisi == 0) {
            System.out.println("Edilecek pushup qalmadi");
        }
        if (pushup_sayisi - sayi < 0) {
            System.out.println("pushup sayisini kecdiniz");
            pushup_sayisi = 0;
            System.out.println("Qalan pushup sayisi" + pushup_sayisi);
        } else {
            pushup_sayisi -= sayi;
            System.out.println("Qalan pushup sayisi" + pushup_sayisi);
        }

    }

    public void situpEt(int sayi) {
        if (situp_sayisi == 0) {
            System.out.println("Edilecek situp qalmadi");
        }
        if (situp_sayisi - sayi < 0) {
            System.out.println("situp sayisini kecdiniz");
            situp_sayisi = 0;
            System.out.println("Qalan situp sayisi" + situp_sayisi);
        } else {
            situp_sayisi -= sayi;
            System.out.println("Qalan situp sayisi" + situp_sayisi);
        }

    }

    public void squatEt(int sayi) {
        if (squat_sayisi == 0) {
            System.out.println("Edilecek squat qalmadi");
        }
        if (squat_sayisi - sayi < 0) {
            System.out.println("squat sayisini kecdiniz");
            squat_sayisi = 0;
            System.out.println("Qalan squat sayisi" + squat_sayisi);
        } else {
            squat_sayisi -= sayi;
            System.out.println("Qalan squat sayisi" + squat_sayisi);
        }
    }

    public boolean idmanBitdimi() {
        return (burpe_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
}
