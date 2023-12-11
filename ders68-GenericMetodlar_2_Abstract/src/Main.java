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
        Telebeler telebe1 = new Telebeler(25, 12, 15, 10, 13);
        Telebeler telebe2 = new Telebeler(25, 15, 15, 5, 10);
        DigerTelebeler digerTelebe1 = new DigerTelebeler(25, 10, 12, 11, 11);
        DigerTelebeler digerTelebe2 = new DigerTelebeler(25, 5, 2, 12, 6);
        System.out.println(ballarinNeticeleri(telebe1, telebe2));
//        2. ornek=>> bunu yazdigimiz an xeta gelecek. cunki funksiyada geriye donen Telebeler class-miz olduguna goredir. cunki artiq DigerTelebeler clasini geriye dondurmeliyik. ona gore generic olaraq yaziriq
//        DigerTelebeler birinci2 = ballarinNeticeleri(digerTelebe1, digerTelebe2);
//        3. ornek
        DigerTelebeler birinci2 = ballarinNeticeleri(digerTelebe1, digerTelebe2);
        System.out.println(birinci2);

    }
//       1. ornek 24. setre qeder okeydir. 
//    public static Telebeler ballarinNeticeleri(Telebeler telebe1, Telebeler telebe2) {
//        if (telebe1.hesabla() > telebe2.hesabla()) {
//            return telebe1;
//        } else {
//            return telebe2;
//        }
//    }
//    3. ornek generic olaraq yaziriq artiq

    public static <E extends BalHesablayicisi> E ballarinNeticeleri(E telebe1, E telebe2) {
        if (telebe1.hesabla() > telebe2.hesabla()) {
            return telebe1;
        } else {
            return telebe2;
        }
    }
}
