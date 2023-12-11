
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
        Telebe telebe1 = new Telebe("Ruslan", 1, "Frontend");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("telebe.txt"))) {
            out.writeObject(telebe1);

//           2. ornek bunu yazib run file edirik
            Telebe.setTelebeSayisi(100);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya tapilmadi");
        } catch (IOException ex) {
            System.out.println("Dosya acilarken IOExc yarandi");
        }
    }
}
