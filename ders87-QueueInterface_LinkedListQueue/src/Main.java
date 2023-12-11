
import java.util.LinkedList;
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
        /*
* Queue(Quyruq) Interface'ini implemente eden LinkedList Classı FIFO(First In, First Out mentiqi ile çalışır.) 
* add(Dəyər) ----> Dəyəri quyruğa əlavə edər. Əlavə edə bilməzsə Xəta döndürür.
* offer(Dəyər) ----> Dəyəri quyruğa əlavə edər. Əlavə edərsə True dönər, Əlavə edə bilməzsə False dönər.
* remove() ----> Quyruğun ən başındakı Dəyəri quyrukdan çıxarır. Quyruq boş isə Xəta döndürür.
* poll() ------>  Quyruğun ən başındakı Dəyəri quyrukdan çıxarır. Quyruq boş isə null referans dönər.
* element() ---->  Quyruğun ən başındakı Dəyəri quyrukdan çıxarır. Quyruq boş isə  hXəta döndürür.
* peek() ------>  Quyruğun ən başındakı Dəyəri quyrukdan çıxarır. Quyruq boş isə null referans dönər.
*
         */
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
//        1. ornek peek metodu
        System.out.println(queue.peek());
//        2. ornek forEach metodu
        for (String s : queue) {
            System.out.println(s);
        }
//        3. ornek poll metodu
        System.out.println("Deyer Çıxarılır : " + queue.poll());
        for (String s : queue) {
            System.out.println(s);

        }
//        4. ornek isEmpty metodu
        System.out.println(queue.isEmpty());
        while (!queue.isEmpty()) {
            System.out.println("Deyer Çıxarılır : " + queue.poll());
        }
         System.out.println(queue.isEmpty());
    }
}
