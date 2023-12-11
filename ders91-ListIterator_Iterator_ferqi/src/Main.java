
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

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
        // ListIterator vs Iterator

        /*
    ListIterator
    
    Sadəcə List Interface'i implemente edən classlarda istifadə olunur.
    next() ve previous() metodu vardır. 
    üstəlik add() metodu var.
    
    Iterator: 
    
    Set , Queue ve List Interface'i implement'e edən classlarda istifadə olunur.
    previous() metodu yoxdur.
    
         */
//   1. ornek
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {

            System.out.println(iterator1.next());

        }
        System.out.println("*******************************");
//        2. defe hasNext ile yazanda artiq deyerlerimiz olmadigina gore gostermeyecek 
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }
        System.out.println("*********/*******/*/*/*/*//*/*/*/*/*//*/*/*/*/");
//       2. ornek List Interface
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println("*******************************");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());

        }
//        2.1 ornek silmek istesek
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("Go")) {
                iterator.remove();

            }

        }
        System.out.println("****00000******");
        for (String s : list) {
            System.out.println(s);

        }
//         3. ornek  List-i bir de Iterator ile yoxlamaq
        Iterator<String> iterator2 = list.iterator();
        System.out.println("*******************************");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());

        }

        System.out.println("*******************************");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());

        }
    }

}
