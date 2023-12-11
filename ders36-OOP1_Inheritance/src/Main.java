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
        Mudur mudur = new Mudur("World-Telecom", 60);
        Calisanlar isciler = new Calisanlar("World-Telecom", 60);
        System.out.println(isciler.getProyekt());
        System.out.println(isciler.getVaxt());
        isciler.mudurunGosterisi();
    }
}
