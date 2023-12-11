
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treemap = new TreeMap<Integer, String>();

        System.out.println("******************");
        mapYazdir(hashmap);
        System.out.println("******************");
        System.out.println("******************");
        mapYazdir(linkedhashmap);
        System.out.println("******************");
        System.out.println("******************");
        mapYazdir(treemap);
        System.out.println("******************");

    }

    public static void mapYazdir(Map<Integer, String> map) {

        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        /*for (Map.Entry<Integer,String> entry : map.entrySet()) {
            
            System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
            
        }*/
        //System.out.println(map.keySet());
        /*for (Integer key : map.keySet()){
            
            System.out.println("Key : " + key + " Value: " + map.get(key));
            
        }*/
        Collection<String> values = map.values();

        for (String s : values) {
            System.out.println("Deyer : " + s);

        }

    }
}
