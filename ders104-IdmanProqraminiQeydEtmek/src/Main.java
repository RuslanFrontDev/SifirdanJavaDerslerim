
import java.io.FileWriter;
import java.io.IOException;
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
        System.out.println("Idmanimiza xos geldiniz");
        String idmanlar = """
                          Edeceyiniz hereketler
                          Burpee
                          Pushup
                          Situp
                          Squat
                          """;
        System.out.println(idmanlar);
        System.out.println("Bir idman yaradin");
        System.out.print("Burpee sayisi=>>");
        int burpee = scan.nextInt();
        System.out.print("Pushup sayisi=>>");
        int pushup = scan.nextInt();
        System.out.print("Situp sayisi=>>");
        int situp = scan.nextInt();
        System.out.print("Squat sayisi=>>");
        int squat = scan.nextInt();
        scan.nextLine();
        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("Idmaniniz basladi");
        int i = 1;
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("Idman Proqramlari..\n");
            writer.write("Burpee Sayisi: " + idman.getBurpe_sayisi() + " \n");
            writer.write("Pusup Sayisi: " + idman.getPushup_sayisi() + " \n");
            writer.write("Situp Sayisi: " + idman.getSitup_sayisi() + " \n");
            writer.write("Squat Sayisi: " + idman.getSquat_sayisi() + " \n");
            
            while (idman.idmanBitdimi() == false) {
                System.out.println("Hereket Novu (Burpee, Pushup, Situp, Squat)");
                String nov = scan.nextLine();
                System.out.println("Bu hereketden ne qeder edessen?");
                int sayi = scan.nextInt();
                scan.nextLine();
                idman.hereketeBasla(nov, sayi);
                writer.write(i + ". islem------------>>>>>>>> Hereketiniz: " + nov + " Sayi: " + sayi + " \n");
            }
            System.out.println("Idman hereketlerini bitirdin...");
        } catch (IOException e) {
            System.out.println("");
        }
    }
}
