/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Sinif1 {

    private String name;
    private int age;
    private int password;
//   1. ornek qisa
//    public Sinif1() {
//        this("ruslan", 25, 123456);
//    }
//
//    public Sinif1(String name, int age, int password) {
//        this.name = name;
//        this.age = age;
//        this.password = password;
//    }
//    2. ornek

    public Sinif1(String name) {
        this(name, 25, 123456);
    }

    public Sinif1(String name, int age, int password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
