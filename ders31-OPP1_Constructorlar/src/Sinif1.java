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

//   1. ornek  Constructor yazilimi
    public Sinif1() {
        System.out.println("Constructor");
    }
//    2. ornek birden cox constructorlar yazila bilir(metod overloading)

    public Sinif1(String name, int age, int password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPassword() {
        return password;
    }

    public void passwordDeyis(int editPassword) {
        this.password = editPassword;
        System.out.println("Guncel Passwordunuz=>>" + this.password);
    }
}
