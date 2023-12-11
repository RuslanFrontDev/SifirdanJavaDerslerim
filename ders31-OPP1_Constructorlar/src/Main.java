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
//        1. ornek constructorsuz
//        Sinif1 sinif1 = new Sinif1();
//        sinif1.setAge(25);
//        sinif1.setName("Ruslan");
//        sinif1.setPassword(123456);
//        System.out.println(sinif1.getPassword());
//        sinif1.passwordDeyis(255);
//        System.out.println(sinif1.getPassword());
//        2. ornek constructorla
        Sinif1 sinif1 = new Sinif1("Ruslan", 25, 123456);
        System.out.println(sinif1.getPassword());
        sinif1.passwordDeyis(255);
        System.out.println(sinif1.getPassword());

    }
}
