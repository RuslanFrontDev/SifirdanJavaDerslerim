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
//        Final ile yazilan ozellik ve ya metod sadece bir defe verile bilir. ve bu deyer ya tanimlandigi zaman ya da constructorun icerisinde verile bilir
// basqa her hansisa biir funksiyada da biz buna ozellik vere bilmirik
// deyisdirmeyini istemediyimiz yerlerde misal sifre ve s. o zaman final acar kelimesinden istifade olunur
//final ile tanimlanan ozelliklerin getter ve setter metodlari olmur
        FinalAcarKelimesi finalText1 = new FinalAcarKelimesi("Ruslan");
        FinalAcarKelimesi finalText2 = new FinalAcarKelimesi("Eli");
        System.out.println("Sayilari:"+ finalText1.classlar);
        System.out.println("Sayilari:"+ finalText2.classlar);
//      22. setirde de burada da xeta verecek
//      finalText1.classlar = 6;
//      Math.PI de final kimi tanimlanib
//      Math.PI = 1.1;
//      son ornek Datalar classi
System.out.println("Database:"+Datalar.database_name);
System.out.println("Username:"+Datalar.username);
System.out.println("PAsssword:"+Datalar.password);

    }
}
