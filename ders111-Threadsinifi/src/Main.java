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
//        1. ornek
        Ornek1 o1 = new Ornek1();
        o1.start();
//        2 ornek
        Ornek2 o2 = new Ornek2();
//        3. ornek
        System.out.println("**************");
        Ornek3 o3 = new Ornek3(5, "Ruslan");
//        4. ornek
        System.out.println("**************");
        Ornek4 o4 = new Ornek4();
        o4.run();
    }
   /*
    Burada ulduzlar 2.ornekden evvel de gele biler sonrada dediyimiz kimi Threadlerin ne zaman
    calisacagi belli deyildir
    */    
}
