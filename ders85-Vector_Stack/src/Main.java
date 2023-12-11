
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

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
        Vector<String> vector = new Vector<String>();

        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");
//        1. ornek forEach ile ayirmaq
        for (String s : vector) {
            System.out.println(s);
        }
        // 2. ornek ListIterator ile ayirmaq
        ListIterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
//        3. ornek Enumeration usulu ile ayirmaq
        Enumeration<String> enumaration = vector.elements();
        while (enumaration.hasMoreElements()) {
            System.out.println(enumaration.nextElement());
        }
        System.out.println("İlk Deyer : " + vector.firstElement());
        System.out.println("Son Deyer : " + vector.lastElement());
//        4. ornek Stack dersine kecid
        Stack<String> stack = new Stack<String>();

        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
 //      5. ornek Stack-larda pop metodu
        System.out.println("Son deyer cixarilir : " + stack.pop());
        for (String s : stack) {
            System.out.println(s);
        }
//        6.ornek Stack-larda empty metodu
        System.out.println("****************");
        System.out.println(stack.empty());
//        deyerler cixarildigina gore 7. ve 8. ornek calismiyacaq
//        while (!stack.empty()) {
//            System.out.println("Eleman Çıkarılıyor : " + stack.pop());
//        }
        System.out.println("****************");

//      7. ornek Stack-larda forEach metodu
        for (String s : stack) {
            System.out.println(s);
        }
//        8. ornek Stack-larda Enumeration metodu
        Enumeration<String> enumeration = stack.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
