/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Beden {
// El Objemi bura yazacam

    private int ureyinSureti;
    private boolean damarTixaniqligi;
    private int boyrekSayisi;
    private El el;

    public Beden(int ureyinSureti, boolean damarTixaniqligi, int boyrekSayisi, El el) {
        this.ureyinSureti = ureyinSureti;
        this.damarTixaniqligi = damarTixaniqligi;
        this.boyrekSayisi = boyrekSayisi;
        this.el = el;
    }

    public El getEl() {
        return el;
    }

    public void setEl(El el) {
        this.el = el;
    }

    public int getUreyinSureti() {
        return ureyinSureti;
    }

    public void setUreyinSureti(int ureyinSureti) {
        this.ureyinSureti = ureyinSureti;
    }

    public boolean isDamarTixaniqligi() {
        return damarTixaniqligi;
    }

    public void setDamarTixaniqligi(boolean damarTixaniqligi) {
        this.damarTixaniqligi = damarTixaniqligi;
    }

    public int getBoyrekSayisi() {
        return boyrekSayisi;
    }

    public void setBoyrekSayisi(int boyrekSayisi) {
        this.boyrekSayisi = boyrekSayisi;
    }

    public void boyrekler() {
        System.out.println("Boyrek sayisi " + boyrekSayisi + "-dir");
    }

    public void tixaniqliq() {
        if (damarTixaniqligi) {
            System.out.println("Damar tixaniqliginiz var");
        } else {
            System.out.println("Damar tixaniqliginiz yoxdur");
        }
    }

    public void urekSureti() {
        System.out.println("Ureyinizin sureti " + getUreyinSureti());
    }
}
