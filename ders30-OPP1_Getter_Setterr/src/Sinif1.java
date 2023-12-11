/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Sinif1 {
// 1. ornek
//    private String name = "Ruslan";
//    private int age = 25;
//    private int password = 123456;
//
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public int getPassword() {
//        return password;
//    }
//    2. ornek

    private String name;
    private int age;
    private int password;

//    burada this.name kimi vermek istemirikse gonderilen adlar ferqli olmalidir
//    public void setName( String name) {
//       name = name;
//    }
    public void setName( String ad) {
       name = ad;
    }
    public String getName(){
       return name;
    }
}
