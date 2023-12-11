
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class CarpmaException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("İki sayı da cox boyuk. xais edirik daha kicik sayılar girin..");

    }

}

public class Main {

    public static void main(String[] args) {
        // Switch Case istifade ederek 4 işlem eden bir Cebr cedveli:
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama Islemi\n"
                + "2. Cixma Islemi\n"
                + "3. Vurma Islemi\n"
                + "4. Bolme Islemi";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("Islemi Secin:");
        String islem = scanner.nextLine();
        int a;
        int b;
        try {
            switch (islem) {
                case "1":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Deyerlerin Cemleri : " + (a + b));
                    break;
                case "2":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("Ikinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Deyerlerin Ferqleri : " + (a - b));
                    break;
                case "3":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("Ikinci Sayı: ");
                    b = scanner.nextInt();
                    if (a > 10000 && b > 10000) {
                        throw new CarpmaException();

                    }
                    System.out.println("Girilen Deyerlerin Hasilleri : " + (a * b));
                    break;
                case "4":
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("Ikinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Deyerlerin Qismeti : " + (a / b));
                    break;
                default:
                    System.out.println("Gecersiz İşlem");

            }
        } catch (ArithmeticException e) {
            System.out.println("Bir sayi 0'a bolunmez...");
        } catch (InputMismatchException e) {
            System.out.println("Xais olunur Inputları Doğru Formatda Girin...");
        } catch (CarpmaException ex) {
            ex.printStackTrace();

        }

    }
}
