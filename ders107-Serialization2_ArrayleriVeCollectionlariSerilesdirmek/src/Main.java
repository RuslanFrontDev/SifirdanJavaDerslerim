
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
        Telebe telebe2 = new Telebe("Eli", 2, "Backend");
        Telebe telebe3 = new Telebe("Veli", 3, "Dizayn");
        Telebe[] telebeArr = {telebe1, telebe2, telebe3};
//        1. ornek asList
        System.out.println(Arrays.asList(telebeArr));
//        Arrays.asList(telebeArr) istifade nedeni, array-i bir Liste dönüşdürmekdir. 
        ArrayList<Telebe> telebeList = new ArrayList<>(Arrays.asList(telebeArr));
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("telebe.txt"))) {
            out.writeObject(telebeArr);
            out.writeObject(telebeList);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya tapilmadi");
        } catch (IOException ex) {
            System.out.println("Dosya acilarken IOExc yarandi");
        }
//        Run file edib ObjeyiOxu.java aciriq
    }
}
