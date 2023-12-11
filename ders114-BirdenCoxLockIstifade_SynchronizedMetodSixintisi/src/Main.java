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
//        1. ornek veriler  cox gec yuklendi
        /*  ListElavesi list = new ListElavesi();
        long baslangic = System.currentTimeMillis();
        list.deyerAt();
        long bitis = System.currentTimeMillis();
        System.out.println("zamaniniz: " +(bitis-baslangic));
         */
//        2. ornek burada ise zaman azaldi ancaq deyerler 2000 qeder yazilmadi
        /*  ListElavesi list = new ListElavesi();
        list.calisdiraq();
         */
//        3. ornek Synchronize ile yazanda ise zaman cox olur ama deyerler 2000 olur
        /*    ListElavesi list = new ListElavesi();
        list.calisdiraq();
         */
//     4. ornek lock ile yazmaq
        ListElavesi list = new ListElavesi();
        list.calisdiraq();
    }
}
