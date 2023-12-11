
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class KapitalBank {

    public void wellCome(MusteriGirisi musteri, MusteriOdemeleri odeme) {
        System.out.println("Xos Gelmisiniz!!!");
        System.out.println("Giris haqqiniz 3-dur");
        String nameInput;
        int passwordInput;
        int giris = 3;
        int passwordData = 123456;
        int islemler;
        double cekilenPul;
        double manatInput;
        Scanner scan = new Scanner(System.in);
        System.out.print("Xais olunur adinizi girin:=>>");
        nameInput = scan.nextLine();

        musteri.setPassword(passwordData);
        do {
            System.out.print("Xais olunur Parolunuzu girin:=>>");
            passwordInput = scan.nextInt();
            giris -= 1;
            System.out.println("Qalan Girisiniz==>>" + giris);
            if (passwordInput != passwordData) {
                System.out.println("Parol yanlis. Yeniden yazmaga calisin.");
                continue;
            }
        } while (passwordInput != passwordData);
        if (passwordInput == passwordData) {
            System.out.println("Giris ugurla basa catdi!");
            while (true) {
                System.out.println("""
                                   1->pul cekmek 
                                   2->pul yatirmaq 
                                   3->yekun meqleq 
                                   4-> Cixis""");
                System.out.print("islemleri sec");
                islemler = scan.nextInt();
                if (islemler == 1) {
                    System.out.print("Ne qeder pul cekmek istersiniz?: ");
                    manatInput = scan.nextDouble();
                    odeme.pulCek(manatInput);
                    odeme.setManat(odeme.getManat());
                } else if (islemler == 2) {
                    System.out.print("Ne qeder pul yatirmaq istersiniz?: ");
                    manatInput = scan.nextDouble();
                    if (manatInput <= 0) {
                        System.out.println("Negativ Deyer girme!!!");
                        odeme.setManat(odeme.getManat());
                        break;
                    } else if (manatInput > odeme.getManat()) {
                         odeme.setManat(odeme.getManat());
                        System.out.println("Summaniz coxdur. mebleginiz" + odeme.getManat());
                    } else {
                        odeme.pulYatir(manatInput);

                    }
                } else if (islemler == 3) {
                    System.out.println("Hesap bakiyeniz: " + odeme.getManat());
                } else if (islemler == 4) {
                    System.out.println("Cixis edildi...");
                    break;
                } else {
                    System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
                }
            }
        } else {
            System.out.println("Giris haqqiniz bitdi.");
        }
    }
}
