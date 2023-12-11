/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Insan {

    private Bas bas;
    private Beden beden;
    private Ayaq ayaq;

    public Insan(Bas bas, Beden beden, Ayaq ayaq) {
        this.bas = bas;
        this.beden = beden;
        this.ayaq = ayaq;
    }

    public Bas getBas() {
        return bas;
    }

    public void setBas(Bas bas) {
        this.bas = bas;
    }

    public Beden getBeden() {
        return beden;
    }

    public void setBeden(Beden beden) {
        this.beden = beden;
    }

    public Ayaq getAyaq() {
        return ayaq;
    }

    public void setAyaq(Ayaq ayaq) {
        this.ayaq = ayaq;
    }

}
