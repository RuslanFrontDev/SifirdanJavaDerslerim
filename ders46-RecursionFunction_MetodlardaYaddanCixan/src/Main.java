/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public class Main {
    static int faktoriyal(int sayi){
       if(sayi == 1){
          return 1;
       }
       else{
          return (sayi*(faktoriyal(sayi-1)));
       }
    }
    
    public static void main(String[] args) {
        System.out.println(faktoriyal(5));
    }
}
