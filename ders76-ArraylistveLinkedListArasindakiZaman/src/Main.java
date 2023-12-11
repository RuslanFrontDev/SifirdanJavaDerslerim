
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        List<Integer> number1 = new ArrayList<>();
        List<Integer> number2 = new LinkedList<>();
        reqemElaveEt("Arraylist", number1);
        reqemElaveEt("LinkedList", number2);
    }

    public static void reqemElaveEt(String tip, List<Integer> num1) {
//        1. ornek 
//        long baslangicVaxt;
//        long bitisVaxt;
//        baslangicVaxt = System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//            num1.add(i);
//        }
//        bitisVaxt = System.currentTimeMillis();
//        System.out.println(tip + "-in Elave etdiyi deyer vaxti: " + (bitisVaxt - baslangicVaxt) + "ms");
//        2. ornek
        long baslangicVaxt;
        long bitisVaxt;
        baslangicVaxt = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            num1.add(0,i);
        }
        bitisVaxt = System.currentTimeMillis();
        System.out.println(tip + "-in Elave etdiyi deyer vaxti: " + (bitisVaxt - baslangicVaxt) + "ms");
    }

}
