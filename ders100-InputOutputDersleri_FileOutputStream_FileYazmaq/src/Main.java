
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class Main {

    public static void main(String[] args) {
//        1. ornek
        /*  FileOutputStream fos =null;
            File file = new File("text.txt");
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
//          2. ornek dosya baglamaq
        /*FileOutputStream fos = null;
        File file = new File("text.txt");
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya baglanarken bir xeta oldu");
            }

        }*/
//        3. ornek text dosyasina deyer yazmaq 
        /* FileOutputStream fos = null;
        File file = new File("text.txt");
        try {
//            true yazarsaq 49. ve50. setirleri silsek bele yazilar qalacaq
            fos = new FileOutputStream(file, true);
//            fos.write(int b) add Chach Clause 49. ve50. setri silib yenisini yazsam yenisi yazilmis olacaq
//            fos.write(65);
//            fos.write(74);
            fos.write(59);
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } catch (IOException ex) {
            System.out.println("Dosya yazilarken bir xeta oldu");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya baglanarken bir xeta oldu");
            }
            
        }*/
//       4. ornek byte array-i yazmaq
        /*FileOutputStream fos = null;
        File file = new File("text.txt");
        try {
//            true yazarsaq 49. ve50. setirleri silsek bele yazilar qalacaq
            fos = new FileOutputStream(file, true);
            byte[] arr = {101, 75, 68};
            fos.write(arr);
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } catch (IOException ex) {
            System.out.println("Dosya yazilarken bir xeta oldu");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya baglanarken bir xeta oldu");
            }
            
        }*/
//        5. ornek String array-i
        FileOutputStream fos = null;
        File file = new File("text.txt");
        try {
//            true yazarsaq 49. ve50. setirleri silsek bele yazilar qalacaq
            fos = new FileOutputStream(file, true);
            String s = "Ruslan";
            byte[] s_arr = s.getBytes();
            System.out.println(s_arr);
            fos.write(s_arr);
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } catch (IOException ex) {
            System.out.println("Dosya yazilarken bir xeta oldu");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya baglanarken bir xeta oldu");
            }

        }
    }
}
