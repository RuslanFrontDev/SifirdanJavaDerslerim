/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Beden {

    private int ureyinSureti;
    private boolean damarTixaniqligi;
    private int boyrekSayisi;

    public Beden(int ureyinSureti, boolean damarTixaniqligi, int boyrekSayisi) {
        this.ureyinSureti = ureyinSureti;
        this.damarTixaniqligi = damarTixaniqligi;
        this.boyrekSayisi = boyrekSayisi;
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
