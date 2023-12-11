/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Bas {

    private int gozSayisi;
    private boolean esitmesi;

    public Bas(int gozSayisi, boolean esitmesi) {
        this.gozSayisi = gozSayisi;
        this.esitmesi = esitmesi;
    }

    public int getGozSayisi() {
        return gozSayisi;
    }

    public void setGozSayisi(int gozSayisi) {
        this.gozSayisi = gozSayisi;
    }

    public boolean isEsitmesi() {
        return esitmesi;
    }

    public void setEsitmesi(boolean esitmesi) {
        this.esitmesi = esitmesi;
    }

    public void gozler() {
        System.out.println("Goz sayisi" + getGozSayisi());
    }

    public void esitmeProblemi() {
        if (isEsitmesi()) {
            System.out.println("esidir");
        } else {
            System.out.println("eside bilmir");
        }
    }
}
