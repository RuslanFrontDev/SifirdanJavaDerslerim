/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Telebe1 extends TelebeBase {

    public Telebe1(String name, int Riyaziyyat, int Tarix, int Fizika, int Kimya) {
        super(name, Riyaziyyat, Tarix, Fizika, Kimya);
    }

    public double firstTelebeNeticesi() {
        return (super.getFizika() * super.getKimya() * super.getRiyaziyyat() * super.getTarix());
    }
}
