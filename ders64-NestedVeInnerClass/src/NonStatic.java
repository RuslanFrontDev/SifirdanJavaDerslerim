/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class NonStatic {

    private int a = 1;
// ic-ice siniflerde birden cox sinif yazmaq olar
    public class Inner {

        int a = 10;

        public void run() {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(NonStatic.this.a);
        }
    }
    public class Inner2 {

        int a = 10;

        public void run() {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(NonStatic.this.a);
        }
    }

    public void run() {
        System.out.println(a);
        System.out.println(this.a);
//            28. ve 29. xeta verir.
//            System.out.println(NonStatic.this.a);
//            System.out.println(Inner.this.a);
        Inner inner = new Inner();
        System.out.println(inner.a);
    }
}
