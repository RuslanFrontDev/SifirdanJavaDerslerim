/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class KvadratSahesi extends Fiqur {

    double eni = 10;
    double uzunluuq = 25;

    public KvadratSahesi(String name) {
        super(name);
    }

    @Override
    void saheHesabla() {
        System.out.println(name + "nin sahesi: " + eni * uzunluuq);
    }

}
