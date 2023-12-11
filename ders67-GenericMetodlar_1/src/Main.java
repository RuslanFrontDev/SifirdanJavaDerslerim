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
        Telebe1 telebe1 = new Telebe1("Ruslan", 22, 20, 12, 19);
        Telebe2 telebe2 = new Telebe2("Eli", 12, 20, 22, 19);
        System.out.println(ortalama(telebe1, telebe2));
    }

    public static TelebeBase ortalama(Telebe1 one, Telebe2 two) {
        if (one.firstTelebeNeticesi() > two.secondTelebeNeticesi()) {
            return one;
        } else {
            return two;
        }
    }
}
