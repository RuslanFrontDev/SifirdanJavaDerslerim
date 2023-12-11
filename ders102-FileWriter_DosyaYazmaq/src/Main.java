
import java.io.FileWriter;
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
//        1. ornek doya yaratdiq
        /*FileWriter writer = null;
        try {
            writer = new FileWriter("dosya.txt");
        } catch (IOException ex) {
            System.out.println("Dosya acilarken IOExcp yarandi");
        }
        finally{
            try {
                writer.close();
            } catch (IOException ex) {
                System.out.println("Dosya baglanarken bir xeta oldu");
            }
        }*/
//        2. ornek dosyaya nese yaziriq
        FileWriter writer = null;
        try {
            writer = new FileWriter("dosya.txt", true);
//            (String str)
            writer.write("Ruslan\n");
            writer.write("Eli\n");
            writer.write("Veli\n");
        } catch (IOException ex) {
            System.out.println("Dosya acilarken IOExcp yarandi");
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                System.out.println("Dosya baglanarken bir xeta oldu");
            }
        }
    }
}
