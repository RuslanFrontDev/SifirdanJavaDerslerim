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
//        1. uzunluq
        String name = "Ruslan";
        System.out.println(name.length());
//        2. Qarsilasdirma 
        String person1 = "Eli";
        String person2 = "Ilyas";
//        if (person1 == person2) {
//            System.out.println("Beraberdir");
//        } else {
//            System.out.println("Beraber deyil");
//        }
        if (person1.equals(person2)) {
            System.out.println("Beraberdir");
        } else {
            System.out.println("Beraber deyil");
        }
//        3. equelsIgnoreCase Bouyuk-kicikliye baxmir;
        String person3 = "Valeh";
        String person4 = "valeh";
        System.out.println("equelsIgnoreCase:" + person3.equalsIgnoreCase(person4));
//       4. Birlesdirme
        String person5 = "Valeh";
        String person6 = "Ilyas";
        System.out.println(person5.concat(person6));
        // 5.   CompareTo ve CompareToIgnoreCase ile >;<;=
        String a = "Ferid";
        String b = "FERID";
        String c = "Ferdi";
        String d = "ferdi";
//        System.out.println(a + " ve " + b + " deyerlerinin compareTo ile qarsilasdirilmasi");
//        System.out.println(a.compareTo(b));
//        System.out.println(a + " ve " + c + " deyerlerinin compareTo qarsilasdirilmasi");
//        System.out.println(a.compareTo(c));
//        System.out.println(d + " ve " + b + " deyerlerinin compareTo qarsilasdirilmasi");
//        System.out.println(d.compareTo(b));
//        System.out.println(c + " ve " + a + " deyerlerinin compareTo qarsilasdirilmasi");
//        System.out.println(c.compareTo(a));
//        System.out.println(a + " ve " + b + " deyerlerinin CompareToIgnoreCase ile qarsilasdirilmasi");
//        System.out.println(a.compareToIgnoreCase(b));
//        System.out.println(a + " ve " + c + " deyerlerinin CompareToIgnoreCase qarsilasdirilmasi");
//        System.out.println(a.compareToIgnoreCase(c));
//        System.out.println(d + " ve " + b + " deyerlerinin CompareToIgnoreCase qarsilasdirilmasi");
//        System.out.println(d.compareToIgnoreCase(b));
//        System.out.println(c + " ve " + a + " deyerlerinin CompareToIgnoreCase qarsilasdirilmasi");
//        System.out.println(c.compareToIgnoreCase(a));
        if (a.compareToIgnoreCase(d) > 0) {
            System.out.println("elifba siralamasinda a d-den kicik olmali idi");

        } else if (a.compareToIgnoreCase(d) < 0) {
            System.out.println("elifba siralamasina gore dogrudu");
        } else {
            System.out.println("ferqlilik yoxdu");
        }
//       6. regionMatchess Soz oyununu
        String countryWord = "Azerbaycanin paytaxti Bakidir";
        String country = "Baki";
        boolean yoxla;
        yoxla = countryWord.regionMatches(22, country, 0, country.length());
        if (yoxla == true) {
            System.out.println("Baki seheri qeyd olunub");
        } else {
            System.out.println("Baki seheri qeyd olunmayib");

        }
//        7. startsWith and endsWith
        String family = "Biz ailede 4 neferik";
        boolean netice;
//        netice = family.startsWith("Biz");
        netice = family.endsWith("neferik");
        System.out.println(netice);
//        7. qaydani indeks ile de vermek olur
        netice = family.startsWith("iz", 1);
        System.out.println(netice);
//     8. getChars ile String bir verinin bir bolumunuu array-e elave etmek
        String arrayeElaveOlunanKodlar = "Stringlerin metodlarini oyrenirik";
        char[] qaynaq1 = new char[6];
        char[] qaynaq2 = new char[11];
        char[] qaynaq3 = new char[9];
        arrayeElaveOlunanKodlar.getChars(0, 6, qaynaq1, 0);
        System.out.println(qaynaq1);
        arrayeElaveOlunanKodlar.getChars(12, 23, qaynaq2, 0);
        System.out.println(qaynaq2);
        arrayeElaveOlunanKodlar.getChars(24, 33, qaynaq3, 0);
        System.out.println(qaynaq3);
//         9. charAt metodu
        String elifba = "abcdefglmnrz";
        System.out.print("Elifbanin 3. herfi=>");
        System.out.println(elifba.charAt(2));
        System.out.print("Elifbanin sonuncu herfi=>");
        System.out.println(elifba.charAt(11));
//      10. toCharArray metodu ile char array-ne cevirmek
        String str = "Char arreyine stringleri elave edirem";
        int uzunluq = str.length();
        char[] charArr = new char[uzunluq];
        charArr = str.toCharArray();
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(charArr[i]);
        }
        System.out.println("");
//    10 indexOf and lastindexOf metodu 
        String str2 = "Men Java oyrenirem";
        System.out.print("Java necenci indeksden baslayir? ");
        System.out.println(str2.indexOf("Java"));
        System.out.print("felimiz necenci indeksden baslayir? ");
        System.out.println(str2.lastIndexOf("oyrenirem"));
//        bu metod ile hetta cumlede hemin sozun olub-olmadigini da mueyyen etmek olur
        int tap = str2.indexOf("Javas");

        if (tap > 0) {
            System.out.println("Javas deyilen sey var");
        } else {
            System.out.println("Javas deyilen sey yoxdur");
        }
//        10. subString metodu
        String str3 = "Orneklerimiz qaldigi yerden davam edir";
        String subStr1 = "";
        String subStr2 = "";
        subStr1 = str3.substring(13, 20);
        subStr2 = str3.substring(21, 27);
        System.out.println(subStr1);
        System.out.println(subStr2);
//        11. replace metodu
        String deyisdirmekIstediyimString = "Galatasaray";
        String deyisdirdiyimStringiBuraElaveEdirem = "";
        deyisdirdiyimStringiBuraElaveEdirem = deyisdirmekIstediyimString.replace("G", "Q");
        System.out.println(deyisdirdiyimStringiBuraElaveEdirem);
//        12. Trim metodu
        String emailInput = "     ruslan@gmail.com  ";
        System.out.println(emailInput);
        String bosluqsuzEmail = emailInput.trim();
        System.out.println(bosluqsuzEmail);
//        13. toUpperCase and toLowerCase
        String str4 = "ruslan";
        String big = str4.toUpperCase();
        String small = str4.toLowerCase();
        System.out.println(big);
        System.out.println(small);
//        14. valuof metodu ile Stringe cevirmek
        int i = 100;
        float f = 11.f;
        boolean secim = false;
        Object o = new String("Aslan ");
        String s = "";
        s = String.valueOf(o);
        s = s + String.valueOf(f);
        System.out.println("-"+s);

    }

}
