/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class BeybladeFabriki {

    public Beyblade beybladeQur(String beyblade_tipi) {
        if (beyblade_tipi.equals("Dragon")) {
            return new Dragon("MaviEjdaha", "kutsal canavarla danismaq", "Takao", 800, 300);
        } else if (beyblade_tipi.equals("Dranza")) {
            return new Dranza("Qirmizi Anka Qusu", "Kai", 500, 400);
        } else if (beyblade_tipi.equals("Drayga")) {
            return new Dranza("Ag Peleng", "Rei", 800, 250);
        } else if (beyblade_tipi.equals("Draciel")) {
            return new Dranza("Qara Qurbaga", "Max", 400, 1000);
        } else {
            return null;
        }
    }
}
