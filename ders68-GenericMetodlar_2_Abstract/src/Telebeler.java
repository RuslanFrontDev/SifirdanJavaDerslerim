/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Telebeler extends BalHesablayicisi {

    private int Azerbaycan_dili;
    private int fizika;
    private int kimya;
    private int riyaziyyat;
    private int ingilis_dili;

    public Telebeler(int Azerbaycan_dili, int fizika, int kimya, int riyaziyyat, int ingilis_dili) {
        this.Azerbaycan_dili = Azerbaycan_dili;
        this.fizika = fizika;
        this.kimya = kimya;
        this.riyaziyyat = riyaziyyat;
        this.ingilis_dili = ingilis_dili;
    }

    

    @Override
    int hesabla() {
        return (Azerbaycan_dili*4)+(fizika*8)+(kimya*4)+(riyaziyyat*8)+(ingilis_dili*4);
    }

    @Override
    public String toString() {
        return "Telebeler{" + "Azerbaycan_dili=" + Azerbaycan_dili + ", fizika=" + fizika + ", kimya=" + kimya + ", riyaziyyat=" + riyaziyyat + ", ingilis_dili=" + ingilis_dili + '}';
    }

    
}
