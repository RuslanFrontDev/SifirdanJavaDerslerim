
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
    public static void main(String[] args) {
             String name = "ruslan";
        int yas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hava limanina xos gelmisiniz");
        System.out.println("Adiniz ve yasinizi qeyd edin=>>");
        name = scan.nextLine();
        yas = scan.nextInt();
//        scan.nextLine();
        Insan insan = new Insan(name, yas);
        while (true) {
            if (insan.hebsdeOlubmu() || insan.yascaKicikmi() || insan.qacaqciliq()) {
                System.out.println("Size hebs, qacaqciliq ve ya yas mehdudiyyetine gore bilet verilmedi");
                break;
            } else {
                System.out.println("Hornmetli " + name + " bey biletinizi 35. kassadan ala bilersiniz");
                break;
            }
        }

    }
}
