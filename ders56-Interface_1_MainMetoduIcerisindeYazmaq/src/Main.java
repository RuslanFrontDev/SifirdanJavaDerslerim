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
//       1. ornek Kohne metods
//        ITelevizor televizor = new ITelevizor() {
//            @Override
//            public String kanal() {
//                return "Atv";
//            }
//        };
//        2. yeni metod
        ITelevizor televizor = () -> "Atv";
        System.out.println(televizor.kanal());
    }
}
