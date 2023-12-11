/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Problem {

    public static class Riyaziyyat {

        public static void daireSahesi(int radius) {
            System.out.println("Dairenin sahesi: " + Math.PI * radius * radius);
        }

        public static void Kvadrat(int en, int uzunluq) {
            System.out.println("Dairenin sahesi: " + en * uzunluq);
        }
    }

    public static class Fizika {

        public static void icVurma(Vector v1, Vector v2) {
            int icvurma = v1.getI() * v2.getI() + v1.getJ() * v2.getJ() + v1.getK() * v2.getK();
            System.out.println(v1.getAd() + " ile " + v2.getAd() + " -nin ic ice vurulmasindan =>>" + icvurma);
        }

    }

}
