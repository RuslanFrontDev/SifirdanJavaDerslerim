
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
//        1. repeat Tekrarlamaq metodu
        String tekrar = "Ruslan";
        System.out.println(tekrar + " 3 defe tekrarlandi=>" + tekrar.repeat(3));
//        2. isBlank metodu ile bos kontrolu
        String bosluqVarmi = "Ruslan";
        String bosluqVarmi2 = " ";
        String bosluqVarmi3 = "";
        System.out.println(bosluqVarmi.isBlank());
        System.out.println(bosluqVarmi2.isBlank());
        System.out.println(bosluqVarmi3.isBlank());
//        3. strip, stripLeading, stripTrailing metodlari ile bosluqlari silmek
        String bosluqlariSil1 = " Ruslan ";
        String bosluqlariSil2 = " Ruslan ";
        String bosluqlariSil3 = "  Ruslan ";
        System.out.println("Kontrol edirem sadece=>>" + bosluqlariSil1);
        System.out.println("Kontrol edirem sadece=>>" + bosluqlariSil2);
        System.out.println("Kontrol edirem sadece=>>" + bosluqlariSil3);
        System.out.println("#" + bosluqlariSil3.strip() + "#");// her iki teref
        System.out.println("#" + bosluqlariSil2.stripLeading() + "#");// sol teref
        System.out.println("#" + bosluqlariSil1.stripTrailing() + "#");// sag teref
//4. /n; /r; /r/n
        String a = "salam\nRuslan\rNecesen?";
        System.out.println(a);
//        5. transform metodu
         List<String> seherListi = new ArrayList<>();
        seherListi.add("Baki");
        seherListi.add("Sumqayit");
        
        List<String> yeniSeherler = seherListi.stream()
            .map(s -> s.transform(str -> str.toUpperCase()))
            .collect(Collectors.toList());
            
        System.out.println(yeniSeherler);
//        6. son olaraq
System.out.println("""
                   1. qayda1
                   2. qayda2
                   3. qayda3
                   """);
    }
}
