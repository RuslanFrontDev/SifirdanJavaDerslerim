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
//        Nested Classlar ic-ice class-lardir. 3 yere bolunur
//         1. Inner Class =>>(ic sinifler)
//                -Static
//                -Non-Stattic
//         2. Local Class
//         3. Anonim Class
//.................................................
//      1. ornek Inner
//        NonStatic.Inner nonStatic = new NonStatic().new Inner();
//        nonStatic.run();
//        NonStatic nonStatic2 = new NonStatic();
//        nonStatic2.run();
//        Inner static olduguna gore Static() deye yazmadiq
//        2. ornek Static
//        Static.Inner s = new Static.Inner();
//        s.run();
//        3. ornek Local
//        Local local = new Local();
//        local.run();
//    4. ornek Anonim
        Anonim a = new Anonim() {
            public void run() {
                System.out.println("Anonim Sinif");
            }

            public void print() {
                System.out.println("Anonim Print");
            }
        };
        a.run();
        //   QEYD: Eger Anonim class-da olmayan bir funksiya yazacayiqsa error ile uzleseciyik      
//        a.print();
    }
}
