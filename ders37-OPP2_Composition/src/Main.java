/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Main {

    public static void main(String[] args) {
        Bas bas = new Bas(2, true);
        Beden beden = new Beden(125, false, 2);
        Ayaq ayaq = new Ayaq(10, true);
        Insan insan = new Insan(bas, beden, ayaq);
        insan.getAyaq().damarlar();
        insan.getBeden().tixaniqliq();
    }
}
