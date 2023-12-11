
import java.util.PriorityQueue;
import java.util.Queue;

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
        Queue<Xeste> teciliYardim = new PriorityQueue<>();
        teciliYardim.offer(new Xeste("Ruslan", "KoronoVirus"));
        teciliYardim.offer(new Xeste("Eli", "Bas Agrisi"));
        teciliYardim.offer(new Xeste("Veli", "3.yaniq"));
        teciliYardim.offer(new Xeste("Sahil", "3.yaniq"));
        teciliYardim.offer(new Xeste("Azer", "KoronoVirus"));
        teciliYardim.offer(new Xeste("Bunyad", "Bas Agrisi"));
        int i = 1;
        while(teciliYardim.isEmpty() != true){
            System.out.println("*********************");
            System.out.println(i+".sirada");
            System.out.println(teciliYardim.poll());
            System.out.println("*********************");
            i++;
            
        }
    }
}
