/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
// 11. setir xeta verecek. Çünki hər iki interFace-in də metodlarını yazmaq lazımdır
//public class Ruslan implements Canli, Insan{
//    public void qacmaq(){
//        System.out.println("Ruslan Qacir");
//    }
//}
//............................................
//  1. yontem
//public class Ruslan implements Canli, Insan{
//    public void qacmaq(){
//        System.out.println("Ruslan Qacir");
//    }
//    public void nefesAl(){
//        System.out.println("Ruslan nefes alir");
//    }
//}
//*************************************
// 2. yonetm
public class Ruslan implements Canli, Insan {

    @Override
    public void nefesAl() {
        Insan.super.nefesAl();
    }

    @Override
    public void qacmaq() {
        System.out.println("Qacmaq");
    }

}
