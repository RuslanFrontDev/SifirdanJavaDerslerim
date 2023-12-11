/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Mudur {

    private String proyekt ;
    private int gun;

    public Mudur(String proyekt, int gun) {
        this.proyekt = proyekt;
        this.gun = gun;
    }

    public String getProyekt() {
        return proyekt;
    }

    public int getVaxt() {
        return gun;
    }

    public void setProyekt(String proyekt) {
        this.proyekt = proyekt;
    }

    public void setVaxt(int vaxt) {
        this.gun = vaxt;
    }

    public void mudurunGosterisi() {
        System.out.println("2 ay yeni "+getVaxt()+" gune bitirilmelidir");
    }

}
