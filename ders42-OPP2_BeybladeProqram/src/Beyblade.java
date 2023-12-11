/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Beyblade {

    private String beybladeci;
    private int donusSureti;
    private int hucumGucu;

    public Beyblade(String beybladeci, int donusSureti, int hucumGucu) {
        this.beybladeci = beybladeci;
        this.donusSureti = donusSureti;
        this.hucumGucu = hucumGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusSureti() {
        return donusSureti;
    }

    public void setDonusSureti(int donusSureti) {
        this.donusSureti = donusSureti;
    }

    public int getHucumGucu() {
        return hucumGucu;
    }

    public void setHucumGucu(int hucumGucu) {
        this.hucumGucu = hucumGucu;
    }

    public void hucemEt() {
        System.out.println(beybladeci + " " + hucumGucu + " ve " + donusSureti + " ile hucum edir ");
    }

    public void kutsalCanavar() {
        System.out.println("Bu beyblade-nin kutsal canavari yoxdur");
    }

    public void ozellikleriniGoster() {
        System.out.println("Beybladeci Adi: " + beybladeci);
        System.out.println("Hucum gucu: " + hucumGucu);
        System.out.println("Donus sureti: " + donusSureti);
    }
}
