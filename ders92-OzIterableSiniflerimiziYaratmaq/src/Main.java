
import java.util.Iterator;

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
        String[] kanallar = {"Atv", "KanalD", "AileTv", "AzTv"};
        Radio radio = new Radio(kanallar);
//     1. ornek   15. setirdeki kimi Radio Classini Iterable-siz forEach ile yaza bilmerik
        /*for(String s : radio){
            System.out.println(s);
        }*/
//        2. ornek
        /*for (String s : radio) {
            System.out.println(s);
        }*/
//        ilk yontemimiz yuxardaki kimidir ikinci yontemimiz 3. ornekdadi
//        3. ornek
       /* for (String s : radio) {
            System.out.println(s);
        }*/
//       4. ornek 
Iterator<String> iterator = radio.iterator();
        while (iterator.hasNext()) {
            Object nextElement = iterator.next();
            System.out.println(nextElement);
            
        }
    }
}
