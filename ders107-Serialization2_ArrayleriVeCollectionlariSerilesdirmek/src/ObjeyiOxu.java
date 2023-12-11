
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
            Telebe[] telebe1 = (Telebe[]) in.readObject();
            ArrayList<Telebe> telebeArr = (ArrayList<Telebe>) in.readObject();
            System.out.println("*********************");
            for (Telebe t : telebe1) {
                System.out.println(t);
                System.out.println("____________________");
            }
            System.out.println("*********************");
            for (Telebe t : telebeArr) {
                System.out.println(t);
                System.out.println("____________________");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya tapilmadi");
        } catch (IOException ex) {
            System.out.println("Dosya acilarken IOExc yarandi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sinif tapilmadi");
        }
    }
}
