
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class ObjeyiOxu {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("telebe.txt"))) {
            Telebe telebe = (Telebe) in.readObject();
            System.out.println(telebe);
//            2. ornek 
            /*
               burada telebe sayi 0 deye gelecek
               Cunki static olaraq yazildigina gore ( private static int telebeSayisi = 0;)
               avtamatik olaraq transient kimi davranir
             */
            System.out.println("telebe sayisi: " + Telebe.getTelebeSayisi());
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya tapilmadi");
        } catch (IOException ex) {
            System.out.println("Dosya acilarken IOExc yarandi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sinif tapilmadi");
        }
    }
}
