
import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player> {

    private String ad;
    private int id;

    public Player(String ad, int id) {
        this.ad = ad;
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {

        if (this.id < player.id) {
            return 1;

        } else if (this.id > player.id) {
            return -1;
        }
        return 0;

    }

    @Override
    public String toString() {
        return "Player{" + "ad=" + ad + ", id=" + id + '}';
    }

}

public class Main {

    public static void main(String[] args) {
        /*
    Queue Interface ve PriorityQueue Sinifi

    PriorityQueue normal Queue məntiqi kimi davranmaz. Dəyərlər proritet sıralarına görə yüksək öncəlik qazanıb
        (
    Integerlarda ən yüksək öncəlik en kiçik sayıda, ən düşük öncəlik  ən böyük sayıdadır.
    Stringlərdə ən yüksək öncəlik alfabetik olarak sözlükdə ən əvvəl gələn stringdə, 
    ən düşük öncəlik  alfabetik olaraq sözlükdə ən son gələn stringdədir.

    )

    Quyruqda Əvvəllərə keçər (Eynən Xəstəxanadakı Təcili Servislər kimi). 

    add veya offer() metodları --------> Quyruğa dəyər elavə edər.(Əvvəlki gördüyümüz özəllikləri daşıyır.)
    clear() metodu --------> Quyruğu Təmizləyər.
    contains(Object o) ------> o objesi Quyruğun içində isə true, deyilsə false dönər.
    peek() ------> Quyruğun başındakı dəyəri dönər.Əgər quyruq boş isə null referans dönər.
    poll() -----> Quyruğun başındakı dəyəri çıxardır və dəğər olaraq dönər. Əğər quyruq boş isə null referans dönər.
    size()------> Quyruğun içindəki dəyər sayısını dönər.
         */
        
        
        Queue<Player> queue = new PriorityQueue<Player>();

        queue.offer(new Player("Ruslan", 2));
        queue.offer(new Player("Eli", 1));
        queue.offer(new Player("Veli", 3));
//  1. ornek
//QEYD:::: forEach metodu islemez
        while (!queue.isEmpty()) {

            System.out.println("Deyer cixarilir : " + queue.poll());
        }
//   2. ornek
        System.out.println("************************");
        Queue<Integer> queue2 = new PriorityQueue<>();

        queue2.offer(2);
        queue2.offer(1);
        queue2.offer(3);
        queue2.offer(5);
        queue2.offer(10);
        queue2.offer(20);
        queue2.offer(100);
        while (!queue2.isEmpty()) {

            System.out.println("Deyer cixarilir : " + queue2.poll());
        }
    }
}
