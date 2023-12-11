/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
abstract class Fiqur{
    String name;

    public Fiqur(String name) {
        this.name = name;
    }
    public void fiqurName(){
        System.out.println("Fiqurunuz: "+ name);
    }
    abstract void saheHesabla();
}
