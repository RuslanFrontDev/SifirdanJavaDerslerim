/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Static {

    private int a = 10;
    private static int b = 2;

    public static class Inner {

        int a = 1;

        public void run() {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(b);
//Class Static olduguna gore Inner-dan bir nesne yazmayacam. yazmadigima gore de ust sinifi ile elaqe saxlanilmir
//            System.out.println(Static.this.a);
        }

    }
}
