
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
        KapitalBank kapitalBank = new KapitalBank();
        MusteriGirisi musteri = new MusteriGirisi();
       
        MusteriOdemeleri odeme = new MusteriOdemeleri();
        kapitalBank.wellCome(musteri, odeme);

    }
}
