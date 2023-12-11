/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class El {

    private int elBarmaqlari;

    public El(int elBarmaqlari) {
        this.elBarmaqlari = elBarmaqlari;
    }

    public int getElBarmaqlari() {
        return elBarmaqlari;
    }

    public void setElBarmaqlari(int elBarmaqlari) {
        this.elBarmaqlari = elBarmaqlari;
    }

    public void eldekiBarmaqSayi() {
        System.out.println("El barmaq sayin "+ getElBarmaqlari());
    }
}
