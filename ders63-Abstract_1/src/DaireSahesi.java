/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class DaireSahesi extends Fiqur {
    double radius = 5;

    public DaireSahesi(String name) {
      super(name);
    }

    @Override
    void saheHesabla() {
        System.out.println(name +"nin sahesi: " + Math.PI * radius * radius);
    }

}
