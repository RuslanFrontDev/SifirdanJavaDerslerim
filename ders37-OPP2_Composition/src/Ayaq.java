/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Ayaq {

    private int dirnaq;
    private boolean damar;

    public Ayaq(int dirnaq, boolean damar) {
        this.dirnaq = dirnaq;
        this.damar = damar;
    }

    public int getDirnaq() {
        return dirnaq;
    }

    public void setDirnaq(int dirnaq) {
        this.dirnaq = dirnaq;
    }

    public boolean isDamar() {
        return damar;
    }

    public void setDamar(boolean damar) {
        this.damar = damar;
    }

    public void dirnaqSayisi() {
        System.out.println("Insanda dirnaq sayisi " + getDirnaq() + "denedir");
    }

    public void damarlar() {
        if (isDamar()) {
            System.out.println("Damar var");
        } else {
            System.out.println("Damar yoxdu");
        }
    }
}
