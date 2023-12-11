
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
        Scanner scan = new Scanner(System.in);
        System.out.print("Cumle yazin: ");
        String cumle = scan.nextLine();
        Map<Character, Integer> frekans = new TreeMap<>();
        for(int i = 0; i<cumle.length(); i++){
            char c = cumle.charAt(i);
            if( frekans.containsKey(c)){
                //salam
                frekans.replace(c, frekans.get(c)+1);
            }else{
                frekans.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : frekans.entrySet()){
            System.out.println("Soz : " + entry.getKey() + " - "+ entry.getValue() + "-denedir");
        }
    }
}
