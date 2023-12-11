
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class Main {

    public static void islemleriYaz() {
        System.out.println("""
                           0=>Islemleri Goruntule,
                           1=>sonraki sehere get,
                           2=>eveleki sehere get,
                           3=>seher turunu sonlandir,
                           """);

    }

    public static void seherTuru(LinkedList<String> seherler) {
        ListIterator<String> iterator = seherler.listIterator();
        int islem;
        boolean ireli = true;
        islemleriYaz();
        Scanner scan = new Scanner(System.in);
        if (iterator.hasNext()) {
            System.out.println("Hec bir seher tapilmadi");
        }
        boolean cixis = false;
        while (!cixis) {
            System.out.println("Bir islem sec");
            islem = scan.nextInt();
            switch (islem) {
                case 0:
                    islemleriYaz();
                    break;
                case 1:
                    if (!ireli) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ireli = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Sehere gedilir" + iterator.next());
                    } else {
                        System.out.println("Gedilen yer qalmadi");
                    }
                    break;
                case 2:
                    if (ireli) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ireli = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Sehere gedilir" + iterator.previous());
                    } else {
                        System.out.println("seher turu basladi");
                    }
                    break;
                case 3:
                    cixis = true;
                    System.out.println("Cixis edildi");
            }
        }

    }

    public static void main(String[] args) {
        LinkedList<String> seherler = new LinkedList<>();
        seherler.add("Baki");
        seherler.add("Gence");
        seherler.add("Qazax");
        seherler.add("Bilesuvar");
        seherTuru(seherler);

    }
}
