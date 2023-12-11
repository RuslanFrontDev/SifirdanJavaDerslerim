/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruslanrustemov.paket1;

import com.ruslanrustemov.paket2.Heyvan;
import com.ruslanrustemov.paket2.Masin2;

/**
 *
 * @author Nurlan Rustamov
 */
public class Main1 {

    /*
        Access Modifiers
 		 
    Access Modifiers 2 düzeyde erişimi belirlerler.
 		
    Sınıf Düzeyinde Erişim Belirleyiciler
 		
    public : Bir class əgər public yazılmışsa bu class-a paketin içindəki ve paketin çölündəki
    bütün classlar tərəfindan əlçatandır.
 		
    default: default Access Modifier-i istifadə etmək anlamına gəlir. 
    Əgər bir class heçbir Access Modifier istifadə etmədən yazılmışsa, bu class'a sadəcə eyni
    paketin içindəki classlar əlçatandır. Paketin çölündəki classlar bu class'a əlçatan deyil.
 		
    *** protected, Access Modifier-lar classlar üçün istifadə edilməzlər.
 		
 		
    Metod ve Özəllik Səviyyədə Access Modifiers
 		
 		
    public: Əgər bir metod və ya özəllik (class member və ya alan) public olaraq tanımlanmışsa, 
    bu alana paketin içindəki və çölündəki bütün classlar tərəfindan əlçatandır. 
    Ancaq təbii ki bu alanın içində yerləşən classın da əlçatan olması lazım.

    default: Əgər bir metod və ya özəllik tanımlanarkən heç bir erişim Access Modifier 
    istifadə edilməmişsə (default), bu alana sadəcə öz paketindəki classlar əlçatandır.
 		
    protected :Əgər bir metod və ya özəllik (class member və ya alan) protected olaraq tanımlanmışsa, 
    bu alana paketin içindəki digər classlar tərəfindan əlçatan ola blər. Paketin çölündəki 
    classlar isə sadəcə və sadəcə bu alanın olduğu classın bir alt classı isə əlçatan ola bilərr.
 		
    private: Əgər bir alan private olaraq tanımlanmışsa bu alana sadəcə öz classı əlçatandır.
 		
 		
    Daha öncədən öyrəndiyimiz kimi bir metodun içində tanımlanmış deyişkənlər lokal dəyişkən
    olaraq tanımlanırlar. Yəni, bu deyişkənlərə digər metodlardan ve classlardan 
    əlçatan deyil. Buna görə bu dəyişkənlərə access modifier əlavə edilə bilməz.
     */
//    ***********************************************************
    /*
    1. ornek ilk başda bu şəkildə olduğu zaman Java hər ikisində Çalışacaq main metodu olduğuna
    görə yalnız birini çalışdıracaq. ona görə ya bu Main2.Java-dayıqsa bunu bu şəkildə yoruma almalıyıq
    ya da Main1.Java-dayıqsa yenə bu şəkildə yoruma almalıyıq
     */
 /*
    public static void main(String[] args) {
        
    }
     */
//    *****************************************
//    2. ornek Public class
    /*
    public static void main(String[] args) {
        Masin2 masin = new Masin2();
        System.out.println(masin.reng);
    }
     */
//    *************************************
//    3. ornek Default class
    /*
    public static void main(String[] args) {
        Masin2 masin = new Masin2();
        System.out.println(masin.reng);
    }
     */
//    **************************************************
//    4. ornek Private ve ya Protected- claslar
    /*
     public static void main(String[] args) {
        Masin2 masin = new Masin2();
        System.out.println(masin.reng);
    }
     */
    //*********************************
// Metod ve Özəllik Səviyyədə Access Modifiers
//  5. ornek public ozellik
    /*
    public static void main(String[] args) {
        Masin2 masin = new Masin2();
        System.out.println(masin.reng);
    }
     */
    //*********************************
// Metod ve Özəllik Səviyyədə Access Modifiers
//  6. ornek public ozellik
    /*
    public static void main(String[] args) {
        Masin2 masin = new Masin2();
        System.out.println(masin.reng);
    }
     */
    //*********************************
// Metod ve Özəllik Səviyyədə Access Modifiers
    //  7. ornek default ozellik 
    /* public static void main(String[] args) {
        Masin2 masin = new Masin2();
        System.out.println(masin.reng);
    }
     */
    //*********************************
// Metod ve Özəllik Səviyyədə Access Modifiers
    //  8. ornek protected ozelliyi daha yaxsi basa dusmek ucun paket2-de Heyvan.java yazdiq
    public static void main(String[] args) {
        Heyvan heyvan = new Heyvan("Ad");
        System.out.println(heyvan.ad);
    }
}
