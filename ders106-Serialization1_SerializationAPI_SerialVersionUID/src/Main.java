
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
//        telebe.txt-bin-dat
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("telebe.txt"))) {
            Telebe telebe1 = new Telebe("Ruslan", 1, "Frontend");
            Telebe telebe2 = new Telebe("Eli", 2, "Dizayn");
//          1. ornek iki dene Objeni (21. ve 22. setirleri) bir dosyaya yazmaq
            out.writeObject(telebe1);
            out.writeObject(telebe2);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya tapilmadi");
        } catch (IOException ex) {
            System.out.println("Dosya acilarken IOExc yarandi");
        }
//        Run file edib ObjeyiOxu.java aciriq
    }
}
