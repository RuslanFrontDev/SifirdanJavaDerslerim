
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
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
        //            1. ornek read metodu

        /*try(FileReader reader = new FileReader("text.txt")){
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
        } catch (FileNotFoundException ex) {
            System.out.println("File Tapilmadi...");
        } catch (IOException ex) {
            System.out.println("Dosya acildiginda xeta oldu");
        }*/
        //         2. ornek Scanner ile oxumaq
        /*try (Scanner reader = new Scanner(new FileReader("text.txt"))) {
            while (reader.hasNextLine()) {
                System.out.println("Oxunacaq Setirler: "+ reader.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Tapilmadi...");
        } catch (IOException ex) {
            System.out.println("Dosya acildiginda xeta oldu");
        }*/
//        3. Örnek vergüldən ayıraraaq işləri yazmaq
        /*try (Scanner reader = new Scanner(new FileReader("text.txt"))) {
            while (reader.hasNextLine()) {
                String isYerleri = reader.nextLine();

                String[] arrStr = isYerleri.split(", ");
                if(arrStr[1].equals("Frontend")){
                    System.out.println(arrStr[0] + "-un isi: "+isYerleri);
                }
                        
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Tapilmadi...");
        } catch (IOException ex) {
            System.out.println("Dosya acildiginda xeta oldu");
        }*/
//        4. ornek BufferedReader uzuuuun dosyalarda performansa görə Buffered FileReader-a nisbətən daha avantajlı 
        /*try (Scanner reader = new Scanner(new BufferedReader(new FileReader("text.txt")))) {
            while (reader.hasNextLine()) {
                String isYerleri = reader.nextLine();
                
                String[] arrStr = isYerleri.split(", ");
                if (arrStr[1].equals("Frontend")) {
                    System.out.println(arrStr[0] + "-un isi: " + isYerleri);
                }
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Tapilmadi...");
        } catch (IOException ex) {
            System.out.println("Dosya acildiginda xeta oldu");
        }*/
//        5. ornek BufferedWriter da performans acisindan avantajli
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt", true))) {
            writer.write("Veli Veliyev, Insaat Muhendisi");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
