/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class GenericSinifkimiYazmaq<E> {
//Qeyd:: Generic Siniflerde metodlar Static deye yazilmir!!!
    public void genericYaz(E[] arr) {
        for (E e : arr) {
            System.out.println(e);
        }
    }
}
