
import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    /*kartlar[0][0]= new Kart('R');
        kartlar[0][1]= new Kart('G');
        kartlar[0][2]= new Kart('C');
        kartlar[0][3]= new Kart('A');
        kartlar[1][0]= new Kart('C');
        kartlar[1][1]= new Kart('G');
        kartlar[1][2]= new Kart('Z');
        kartlar[1][3]= new Kart('D');
        kartlar[2][0]= new Kart('N');
        kartlar[2][1]= new Kart('N');
        kartlar[2][2]= new Kart('D');
        kartlar[2][3]= new Kart('Z');
        kartlar[3][0]= new Kart('A');
        kartlar[3][1]= new Kart('U');
        kartlar[3][2]= new Kart('U');
        kartlar[3][3]= new Kart('R');*/
    private static Kart[][] kartlar = new Kart[4][4];

    public static void qeyddenAL() {
        File file = new File("qeyd.bin");
        Scanner scanner = new Scanner(System.in);
        if (file.exists()) {
            System.out.println("Qeyd etdiyiniz bir oyun var. buradan davam edek? (yes or no)");
            String cavab = scanner.nextLine();
            if (cavab.equals("yes")) {
                kartlar = OyunQeydi.qeydAl(kartlar);
                return;
            }
        }
        kartlar[0][0] = new Kart('R');
        kartlar[0][1] = new Kart('G');
        kartlar[0][2] = new Kart('C');
        kartlar[0][3] = new Kart('A');
        kartlar[1][0] = new Kart('C');
        kartlar[1][1] = new Kart('G');
        kartlar[1][2] = new Kart('Z');
        kartlar[1][3] = new Kart('D');
        kartlar[2][0] = new Kart('N');
        kartlar[2][1] = new Kart('N');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('Z');
        kartlar[3][0] = new Kart('A');
        kartlar[3][1] = new Kart('U');
        kartlar[3][2] = new Kart('U');
        kartlar[3][3] = new Kart('R');

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        qeyddenAL();
        try {
            // UTF-8 karakter encoding'i kullanarak çıktıyı doğru bir şekilde yazdırmak için
            PrintStream out = new PrintStream(System.out, true, "UTF-8");
            out.println("Oyunumuza xoş gəldiniz. Xaiş olunur hərfləri düzgün təxmin edin \uD83D\uDE04");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        while (oyunbittimi() == false) {

            oyunTaxtasi();
            System.out.print("Close=>>>(q) or no: ");
            String cixis = scanner.nextLine();
            if (cixis.equals("q")) {
                System.out.println("oyunu qeyd etmek isteyirsiz? (yes or no)");
                String qeyd = scanner.nextLine();
                if (qeyd.equals("yes")) {
                    OyunQeydi.oyunQeydet(kartlar);
                } else {
                    System.out.println("Oyun qeyd edilmedi");
                }
                System.out.println("Game Close");
                break;
            }
            texminet();
        }
    }

    public static void texminet() {
        Scanner scanner = new Scanner(System.in);
        try {
            // UTF-8 karakter encoding'i kullanarak çıktıyı doğru bir şekilde yazdırmak için
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
            System.out.print("Birinci təxmin (i və ya j dəyərlərini boşluqlarda yazın...):");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        kartlar[i1][j1].setTexmin(true);
        oyunTaxtasi();
        try {
            // UTF-8 karakter encoding'i kullanarak çıktıyı doğru bir şekilde yazdırmak için
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
            System.out.print("Ikinci təxmin (i və ya j dəyərlərini boşluqlarda yazın...):");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        if (kartlar[i1][j1].getDeyer() == kartlar[i2][j2].getDeyer()) {
            kartlar[i2][j2].setTexmin(true);
            System.out.println("Very Gooood. Nice \uD83D\uDE0A");
        } else {
            kartlar[i1][j1].setTexmin(false);
            System.out.println("oh NO \uD83D\uDE22");
        }
    }

    public static boolean oyunbittimi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTexmin() == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void oyunTaxtasi() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTexmin()) {
                    System.out.print(" |" + kartlar[i][j].getDeyer() + " |");
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
    }

}
