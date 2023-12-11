/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
class Insan {

    private String insan;

    public Insan(String insan) {
        this.insan = insan;
    }

    public String getInsan() {
        return insan;
    }

    public void setInsan(String insan) {
        this.insan = insan;
    }

    public void insanMesleyi() {
        System.out.println("Insan insandir");
    }
};

class Hekim extends Insan {

    public Hekim(String insan) {
        super(insan);
    }

    @Override
    public void insanMesleyi() {
        System.out.println("Insan " + getInsan());
    }

};

class Usta extends Insan {

    public Usta(String insan) {
        super(insan);
    }

    @Override
    public void insanMesleyi() {
        System.out.println("Insan " + getInsan());
    }

};

class Muhendis extends Insan {

    public Muhendis(String insan) {
        super(insan);
    }

    @Override
    public void insanMesleyi() {
        System.out.println("Insan " + getInsan());
    }

};

public class Main {

    public static void insanMesleyi(Object object) {
//        burada object. dediyimiz zaman objectin metodları gəldiyinə gğrə belə etdik
        if (object instanceof Hekim) {
            Hekim hekim = (Hekim) object;
            hekim.insanMesleyi();
        }
    }

    public static void main(String[] args) {
        Insan insan1 = new Hekim("hekim");
        insanMesleyi(insan1);
        if (insan1 instanceof Insan) {
            System.out.println("Ust Class-i Insandir");
        } else {
            System.out.println("Ust clasi insan deyil");
        }

    }
}
