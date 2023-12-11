/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Main {
// deyekki el objemiz qaldi. onu da Bedende yazacagiq
    public static void main(String[] args) {
        Bas bas = new Bas(2, true);
        El el = new El(10);
        Beden beden = new Beden(125, true, 2, el);
        Ayaq ayaq = new Ayaq(10, true);
        Insan insan = new Insan(bas, beden, ayaq);
        insan.getAyaq().damarlar();
        insan.getBeden().tixaniqliq();
        beden.getEl().eldekiBarmaqSayi();
    }
}
