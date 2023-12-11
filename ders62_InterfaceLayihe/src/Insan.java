/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Insan implements IControls {

    String ad;
    boolean qacaqciliqElameti = false;
    boolean hebsdeOlmaElameti = false;
    int yasOrtami;

    public Insan(String ad, int yasOrtami) {
        this.ad = ad;
        this.yasOrtami = yasOrtami;
    }

    @Override
    public boolean qacaqciliq() {
        if (qacaqciliqElameti == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hebsdeOlubmu() {
        if (hebsdeOlmaElameti == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean yascaKicikmi() {
        if (yasOrtami < 18) {
            return true;
        } else {
            return false;
        }
    }

}
