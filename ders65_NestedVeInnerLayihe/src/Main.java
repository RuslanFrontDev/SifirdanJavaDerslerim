
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Riyaziyyat ve Fizikaya xos geldiniz...");
        String islemler = """
                          1- DaireSahesini hesabla
                          2-Ucbucaq sahesini hesabla
                          3-Vectorlari hesabla
                          Cixis-q
                          """;
        while (true) {
            System.out.println(islemler);
            System.out.print("Islemleri sec:");
            String islem = scan.nextLine();
            if (islem.equals("q")) {
                System.out.println("Proqramdan cixildi");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Dairenin Radiusu");
                int radius = scan.nextInt();
                scan.nextLine();
                Problem.Riyaziyyat.daireSahesi(radius);
            }else if (islem.equals("2")) {
                System.out.print("Dairenin Radiusu");
                int en = scan.nextInt();
                int uzun = scan.nextInt();
                scan.nextLine();
                Problem.Riyaziyyat.Kvadrat(en, uzun);
            }else if (islem.equals("3")) {
                Vector vec1 = new Vector("VEktor1");
                Vector vec2 = new Vector("VEktor2");
                Problem.Fizika.icVurma(vec1, vec2);
            }
        }
    }
}
