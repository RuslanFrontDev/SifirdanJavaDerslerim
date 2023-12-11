/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class FinalAcarKelimesi {
//   1. 12. setirdeki ornek bu sekilde xetali. 13. setir dogru
//    public final int reqemler;
//     public final int reqemler = 4;
//   3. ornek contructorda yazmaq
//    16.setir 3. ve 4. ornekler ucun
//    public final int reqemler;
//   5 ornek

    public final int classlar;
    private static int sayi = 0;
    private final String ad;

    public FinalAcarKelimesi(String ad) {
//    2. ornek 17. setirdeki yanlis. Cunki bir defe yazilir final 
//        reqemler = 6;
//    3. ornek contructorda yazmaq
//        reqemler = 5;
//    5. ornek
        this.ad = ad;
        sayi++;
        classlar = sayi;
    }
//4. ornek funksiyada yazmaq xetali
//    public void deyerAt(){
//       reqemler = 6;
//    }
}
