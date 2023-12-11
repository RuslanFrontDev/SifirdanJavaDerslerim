
import java.util.LinkedList;
import java.util.ListIterator;

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

        LinkedList<String> dayanacaq = new LinkedList<>();
        dayanacaq.add("Ehmedli");
        dayanacaq.add("Xalqlar");
        dayanacaq.add("Neftciler");
        dayanacaq.add("Koroglu");
        ListIterator<String> avtobusDayanacagi = dayanacaq.listIterator();
//        1. add metodu
        avtobusDayanacagi.add("Dernegul");
        System.out.println(dayanacaq);
//        2.hasNext metodu dayanacaqlar varmi?
        System.out.println(avtobusDayanacagi.hasNext());
//        3. hasPrevious metodu
        System.out.println(avtobusDayanacagi.hasPrevious());
//        4. next metodu
        System.out.println(avtobusDayanacagi.next());
//        5. nextIndex metodu
        System.out.println(avtobusDayanacagi.nextIndex());
//        6. remove metodu remove metodu, bir ListIterator nesnesi üzerinde yalnızca next veya previous metodu çağrıldıktan sonra çağrılabilir.
        avtobusDayanacagi.remove();
        System.out.println(dayanacaq);
//        7. set metodu Set metodu kullanılmadan önce next veya previous metodları çağrılmalıdır. 
        avtobusDayanacagi.next();
        avtobusDayanacagi.set("Bakixanov");
        System.out.println(dayanacaq);

    }
}
