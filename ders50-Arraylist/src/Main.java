
import java.util.ArrayList;

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
//      Qeyd:::: adi array ile ArrayList arasindaki ferq sout ile yazildigi zaman
//        ArrayList arr = new ArrayList();
//        int array[] = {1,2,3};
//        arr.add("Ruslan");
//        arr.add("Aslan");
//        arr.add("Eli");
//        arr.add("Vuqar");
//        System.out.println(arr);
//        System.out.println(array);
//************************************************************************
        ArrayList arr = new ArrayList();
//        1. add metodu
        int array[] = {1, 2, 3};
        arr.add("Ruslan");
        arr.add("Aslan");
        arr.add("Eli");
        arr.add("Vuqar");
//        2. set metodu
        arr.set(1, "Osman");
//        3. remove metodu
        arr.remove("Osman");
//        4.size metodu
        System.out.println(arr.size());
//        5.indexOf metodu
        System.out.println(arr.indexOf("Vuqar"));
        System.out.println(arr.indexOf("Osman"));
        System.out.println(arr);
    }
}
