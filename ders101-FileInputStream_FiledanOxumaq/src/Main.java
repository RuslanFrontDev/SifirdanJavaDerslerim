
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

//        1. ornek  eger sadece javaYazilimi yazsaq xeta firladacaqdi ona gore de
        /* FileInputStream fis = null;
        try {
            fis = new FileInputStream("javaYazilimi");
        } catch (FileNotFoundException ex) {
            System.out.println("dosya oxudularken bir xeta oldu");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("File baglanarken bir xeta oldu");
            }
        }*/
//       *******************************************************
        // 2. ornek
        /*FileInputStream fis = null;
        try {
            fis = new FileInputStream("javaYazilimi.txt");
//            1. xarakteri 40. setirde yazdiq deye 114 cavabini aldiq
            System.out.println(fis.read());
            System.out.println("Oxunan 1. Xarakterler: "+ (char)(fis.read()));
            System.out.println("Oxunan 2. Xarakterler: "+ (char)(fis.read()));
            System.out.println("Oxunan 3. Xarakterler: "+ (char)(fis.read()));
            System.out.println("Oxunan 4. Xarakterler: "+ (char)(fis.read()));
            System.out.println("Oxunan 5. Xarakterler: "+ (char)(fis.read()));
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } catch (IOException ex) {
            System.out.println("dosya oxunarken bir xeta oldu");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("File baglanarken bir xeta oldu");
            }
        }*/
//        /**************************************************************/
//3. ornek::: Ruslan sozunu slan deye oxutmaq istediyimizde ise
        /*FileInputStream fis = null;
        try {
            fis = new FileInputStream("javaYazilimi.txt");
//            1. xarakteri 40. setirde yazdiq deye 114 cavabini aldiq
            fis.skip(2);
            System.out.println("Oxunan 1. Xarakterler: " + (char) (fis.read()));
            System.out.println("Oxunan 2. Xarakterler: " + (char) (fis.read()));
            System.out.println("Oxunan 3. Xarakterler: " + (char) (fis.read()));
            System.out.println("Oxunan 4. Xarakterler: " + (char) (fis.read()));
            System.out.println("Oxunan 5. Xarakterler: " + (char) (fis.read()));
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } catch (IOException ex) {
            System.out.println("dosya oxunarken bir xeta oldu");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("File baglanarken bir xeta oldu");
            }
        }*/
//        *************************************************
//        4. ornek Dosya oxutmagin bir diger yolu
        /*FileInputStream fis = null;
        try {
            fis = new FileInputStream("javaYazilimi.txt");
            int deyer;
            String s = "";
            while ((deyer = fis.read()) != -1) {
                s += (char) deyer;
            }
            System.out.println("Oxunulan file:: " + s);
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } catch (IOException ex) {
            System.out.println("dosya oxunarken bir xeta oldu");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("File baglanarken bir xeta oldu");
            }
        }*/
//        **********************************************
//      5. ornek dosyayi belli bir yerden oxutmaq
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("javaYazilimi.txt");
            int deyer;
            String s = "";
            int say = 0;
            fis.skip(2);
            while ((deyer = fis.read()) != -1) {
                s += (char) deyer;
                say++;
                if (say == 25) {
                    break;
                }
            }
            System.out.println("Dosyanin 2-ci yerinnen etibaren 6 xarakter geldi: " + s);
        } catch (FileNotFoundException ex) {
            System.out.println("dosya acilarken bir xeta oldu");
        } catch (IOException ex) {
            System.out.println("dosya oxunarken bir xeta oldu");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("File baglanarken bir xeta oldu");
            }
        }
    }
}
