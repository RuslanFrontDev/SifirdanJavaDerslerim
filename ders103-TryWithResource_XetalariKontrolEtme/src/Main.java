
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
//        1. ornek
        /* try(FileWriter writer = new FileWriter("dosya.txt")){
            writer.write("Ruslan\n");
        } catch (IOException ex) {
            System.out.println("Dosya yaranarken xeta oldu");
        }*/
//        2. ornek 2 file yazdirmaq istesek
        /*try (
             FileWriter writer1 = new FileWriter("dosya.txt");
             FileWriter writer2 = new FileWriter("dosya2.txt")
            ) {
            writer1.write("Ruslan\n");
            writer2.write("Aysel\n");
            
        } catch (IOException ex) {
            System.out.println("Dosya yaranarken xeta oldu");
        }*/
//        3. ornek
        try (FileWriter diller = new FileWriter("diller.txt")) {
            Scanner scan = new Scanner(System.in);
            String dil;

            while (true) {
                System.out.println("bir Proqram yaz");
                dil = scan.nextLine();

                if (dil.equals("-1")) {
                    System.out.println("Proqramdan Cixilir");
                    System.out.println("Dosyaniza baxin");
                    break;
                }
                diller.write(dil + "\n");

            }

        } catch (IOException ex) {
            System.out.println("Dosya yaranarken xeta oldu");
        }
//       bu kodlara baxaraq yuxardakilarin duzelimidir
        /*FileWriter writer = null;
        try {
            writer = new FileWriter("dosya.txt", true);
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
        }*/
    }
}
