/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class TelebeBase {

    private String name;
    private int Riyaziyyat;
    private int Tarix;
    private int Fizika;
    private int Kimya;

    public TelebeBase(String name, int Riyaziyyat, int Tarix, int Fizika, int Kimya) {
        this.name = name;
        this.Riyaziyyat = Riyaziyyat;
        this.Tarix = Tarix;
        this.Fizika = Fizika;
        this.Kimya = Kimya;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRiyaziyyat() {
        return Riyaziyyat;
    }

    public void setRiyaziyyat(int Riyaziyyat) {
        this.Riyaziyyat = Riyaziyyat;
    }

    public int getTarix() {
        return Tarix;
    }

    public void setTarix(int Tarix) {
        this.Tarix = Tarix;
    }

    public int getFizika() {
        return Fizika;
    }

    public void setFizika(int Fizika) {
        this.Fizika = Fizika;
    }

    public int getKimya() {
        return Kimya;
    }

    public void setKimya(int Kimya) {
        this.Kimya = Kimya;
    }

    @Override
    public String toString() {
          return "TelebeBase{" +
                "name='" + name + '\'' +
                ", Riyaziyyat=" + Riyaziyyat +
                ", Tarix=" + Tarix +
                ", Fizika=" + Fizika +
                ", Kimya=" + Kimya +
                '}';
    }
    
}
