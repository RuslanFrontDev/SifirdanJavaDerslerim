/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Xeste implements Comparable<Xeste> {

    private String name;
    private String sikayeti;
    private int ilkXeste;

    public Xeste(String name, String sikayeti) {
        this.name = name;
        this.sikayeti = sikayeti;
        if (sikayeti.equals("KoronoVirus")) {
            this.ilkXeste = 3;
        } else if (sikayeti.equals("3.yaniq")) {
            this.ilkXeste = 2;
        } else {
            this.ilkXeste = 1;
        }
    }

    @Override
    public String toString() {
        return "Xeste{" + "name=" + name + ", sikayeti=" + sikayeti + ", ilkXeste=" + ilkXeste + '}';
    }

    @Override
    public int compareTo(Xeste xeste) {
        if (this.ilkXeste > xeste.ilkXeste) {
            return -1;
        } else if (this.ilkXeste < xeste.ilkXeste) {
            return 1;
        } else {
            return 0;
        }
    }

}
