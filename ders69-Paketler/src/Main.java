
import com.ruslanrustemov.paket1.User;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//default package-in altinda her hansisa misal Main.java olmasa biz ders69-Paketlerin uzerine gelib
//sag duyme new ve java package-nin uzerine tiklayib paketlerin adlarini yazsaq default package yerine
//yazdigimiz paketin adi gelecek
//
        String name;
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.print("Adiniz:");
        name = scan.nextLine();
        System.out.println("");
        System.out.print("Parolunuz");
        password = scan.nextLine();
        
        User user = new User(name, password);
        user.passwordLogin();
        
    }
}
