
import java.util.ArrayList;
import java.util.LinkedList;

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
        LinkedList<String> dayanacaq = new LinkedList<String>();
//        1. add methodu
        dayanacaq.add("Ehmedli");
        dayanacaq.add("Xalqlar");
        dayanacaq.add("Neftciler");
        dayanacaq.add("Koroglu");
//        2.getFirst metodu
        System.out.println(dayanacaq.getFirst());
//        3. getLast metodu
        System.out.println(dayanacaq.getLast());
//        4.set metodu
        dayanacaq.set(0, "Hezi");
        System.out.println(dayanacaq);
//        5. addFirst metodu
        dayanacaq.addFirst("Ehmedli");
        System.out.println(dayanacaq);
//        6. addLast metodu
        dayanacaq.addLast("Dernegul");
        System.out.println(dayanacaq);
//        7. addAll metodu ArrayList-de olar LinkedList-de 36. setir
        ArrayList<String> number = new ArrayList<String>();
        number.add("bir");
        number.add("iki");
        number.add("uc");
        dayanacaq.addAll(number);
        System.out.println(dayanacaq);
//        8.clone metodu (addAll daha cox istifade olunur)
        LinkedList<String> orijinalListe = new LinkedList<String>();
        orijinalListe.add("Alma");
        orijinalListe.add("Armud");
        orijinalListe.add("Banan");

        // Orijinal LinkedList'i kopyala
        LinkedList<String> kopyaListe = (LinkedList<String>) orijinalListe.clone();
        System.out.println("Orijinal Liste: " + orijinalListe);
        System.out.println("Kopya Liste: " + kopyaListe);
        orijinalListe.add("Ciyelek");

        System.out.println("Orijinal Liste (Ciyelek Elave olunduqdan sonra): " + orijinalListe);
        System.out.println("Kopya Liste (Ciyelek Elave olunduqdan sonra): " + kopyaListe);
//        9. contains
        boolean dayanacaqVarmi = dayanacaq.contains("Ehmedli");
        if (dayanacaqVarmi) {
            System.out.println("Kolleksiyada 'Ehmedli' dayanacagi kecir.");
        } else {
            System.out.println("Kolleksiyada 'Ehmedli' dayanacagi kecmir.");
        }
//        10. elemenet=>>getFirst kimidir
        System.out.println(dayanacaq.element());
//        11.offer metodu ile elave etme
        boolean elaveedildimi = dayanacaq.offer("Ecemi");
        System.out.println(elaveedildimi);
        System.out.println(dayanacaq);
//        12. get metodu
        System.out.println(dayanacaq.get(0));
//        13. indexOf metodu
        System.out.println(dayanacaq.indexOf("Ehmedli"));
//        14. isEmpty metodu
        System.out.println(dayanacaq.isEmpty());
//        15. peek metodu first deyeri verir
        System.out.println(dayanacaq.peek());
        System.out.println(dayanacaq);
//        16. peekLast son degeri verir
        System.out.println(dayanacaq.peekLast());
//        17. poll ilkin deyeri siler
        System.out.println(dayanacaq.poll());
        System.out.println(dayanacaq);
//        18. pop metodu ilkin deyeri siler
        System.out.println(dayanacaq.pop());
        System.out.println(dayanacaq);
//        19. remove bir sonraki deyeri siler
        System.out.println(dayanacaq.remove());
        System.out.println(dayanacaq);
//        20. size metodu
        System.out.println(dayanacaq.size());
//        21. push ilke elave etmek
        dayanacaq.push("bir");
        System.out.println(dayanacaq);
//        son. clear metodu
        dayanacaq.clear();
        System.out.println(dayanacaq);
    }
}
