/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public interface IGovdeli {
//    1. ornek Public ile metod yazimi xetaya sebeb olur
//    public void telefon(){
//        System.out.println("telefon");
//    };
//****************************************
//    2. ornek metod ile yalniz default, static, private ve private static olaraq tanimlanir

    default void privateMetod() {
        System.out.println("Default");
        telefon();
    }

    private void telefon() {
        System.out.println("Private");
        privateStaticMethod();
    }

    static void staticMethod() {
        System.out.println("staticMethod");
    }

    private static void privateStaticMethod() {
        System.out.println("privateStaticMethod");
        staticMethod();
    }

}
