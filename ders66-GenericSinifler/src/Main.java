
import java.util.ArrayList;

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
        Character[] charArray = {'J','A','V','A'};
        Integer[] intArray = {1,2,3,4,5,6};
        String[] strArray = {"Java", "JAvascript","React"};
        Telebe[] telebe = {new Telebe("Ruslan"),new Telebe("Eli"),new Telebe("Veli")};
//        CharArr.charYaz(charArray);
//        StrArr.strYaz(strArray);
//        IntArr.intYaz(intArray);
//        TelebeArr.charYaz(telebe);

        GenericSinifkimiYazmaq<Character> char_yaz = new GenericSinifkimiYazmaq<>();
        GenericSinifkimiYazmaq<Integer> int_yaz= new GenericSinifkimiYazmaq<>();
        GenericSinifkimiYazmaq<String> str_yaz = new GenericSinifkimiYazmaq<>();
        GenericSinifkimiYazmaq<Telebe> telebe_yaz = new GenericSinifkimiYazmaq<>();
        char_yaz.genericYaz(charArray);
        System.out.println("*******************");
        int_yaz.genericYaz(intArray);
        System.out.println("*******************");
        str_yaz.genericYaz(strArray);
        System.out.println("*******************");
        telebe_yaz.genericYaz(telebe);
        System.out.println("*******************");
    }
}
