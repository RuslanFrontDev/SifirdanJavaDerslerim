
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner scan = new Scanner(System.in);
//      1. ornek  bu formada her sey qaydasinda
//        System.out.println("Adiniz:");
//        name = scan.nextLine();
//        System.out.println("Yasiniz:");
//        age = scan.nextInt();
//      2. ornek  burda 17. setire \n kimi gorur
//        System.out.println("Yasiniz:");
//        age = scan.nextInt();
//        System.out.println("Adiniz:");
//        name = scan.nextLine();
//      2.1 ornek 2 yolla bunun qarsini almaq olar
//        System.out.println("Yasiniz:");
//        age = scan.nextInt();
//        scan.nextLine(); // Bu setır tamsayı sonrası yaranan boş setırı temizleyer.
//        System.out.println("Adiniz:");
//        name = scan.nextLine();
        System.out.println("Yasiniz:");
        age = Integer.parseInt(scan.nextLine()); // Tüm satırı bir string olarak alır ve sonra tamsayıya çevirir.
        System.out.println("Adiniz:");
        name = scan.nextLine();
        System.out.println(name + ' ' + age);
    }
}
