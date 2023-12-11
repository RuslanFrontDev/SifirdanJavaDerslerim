
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class Main {
// abstract metodlarini istifade etmek isteyirikse metodun yanina public yazilmalidir
    public static void main(String[] args) {
        Fiqur daire = new DaireSahesi("Daire");
        KvadratSahesi kvadrat = new KvadratSahesi("Kvadrat");
        daire.saheHesabla();
        kvadrat.saheHesabla();
    }
}
