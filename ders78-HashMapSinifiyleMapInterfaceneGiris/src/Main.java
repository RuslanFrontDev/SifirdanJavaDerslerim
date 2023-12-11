
import java.util.HashMap;
import java.util.Map;

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
        //        1. Dəyərləri Acar(Key) və Dəyər (Value) olaraq məlumatları saxlayar.Hər bir Açar müvafiq bir dəyəri var.
        //        2. Bir Açar yalnız bir dəfə mövcuddur. Lakin bir dəyər birdən çox ola bilər.
        //        3. Elementləri eynilə HashSet kimi sıralayar
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Java");
        hashMap.put(3, "Python");
        hashMap.put(5, "Php");
        hashMap.put(2, "Php");
        hashMap.put(2, "Php");

        hashMap.put(5, "Javascript");
        System.out.println(hashMap);
//        2. ornek get metodu
        System.out.println(hashMap.get(5));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(100));
//        3. ornek Map-lerde forEach istifade
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Acar : " + entry.getKey() + " ------> Deyer: " + entry.getValue());
        }
    }
}
