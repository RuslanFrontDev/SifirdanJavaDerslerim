
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
        System.out.println("Beyblade oyununa Xos Gelmissiniz");
        System.out.println("Cixis ucun q-ye bas");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Hansi beyblade-i yazmaq isteyirsiniz?");
            String secim = scan.nextLine();
            if (secim.equals("q")) {
                System.out.println("Oyundan cixildi");
                break;
            } else {

                BeybladeFabriki fabrik = new BeybladeFabriki();
                Beyblade beyblade = fabrik.beybladeQur(secim);
                if (beyblade == null) {
                    System.out.println("Xais olunur kecerli bir beyblade adi girin");
                } else {
                    beyblade.ozellikleriniGoster();
                    beyblade.hucemEt();
                    beyblade.kutsalCanavar();
                }
            }
        }
    }
}
