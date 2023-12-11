
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player> {

    private String ad;

    private int id;

    public Player(String ad, int id) {
        this.ad = ad;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " Ad :" + ad + " |||";

    }

    @Override
    public int compareTo(Player player) {

        if (this.id < player.id) {

            return -1;

        } else if (this.id > player.id) {
            return 1;

        }
        return 0;

    }

}

public class Main {

    public static void main(String[] args) {
        //        1. ornek evvelki dersde sort metodu ile siralayairdiq. ancaq bu sort metodu sadece kicikden-boyuye dogru siralayirdi
        /* List<String> list_string = new ArrayList<String>();

        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");

        Collections.sort(list_string);

        for (String s : list_string) {
            System.out.println(s);
        }*/
//   2. ornek Comparable ile oz yazdigimiz Classlarin deyerlerini siralamaq
//        List<Player> list_player = new ArrayList<Player>();
//
//        list_player.add(new Player("Ruslan", 3));
//        list_player.add(new Player("Eli", 1));
//        list_player.add(new Player("Veli", 5));
//        list_player.add(new Player("Azer", 4));
//      2.1 ornek  
        /*Player p1 = new Player("Ruslan", 3);
        Player p2 = new Player("Eli", 1);
        System.out.println(p2.compareTo(p1));*/
//        2.2 ornek
        /*Collections.sort(list_player);
        for (Player p : list_player) {
            System.out.println(p);
        }*/
//        2.3 ornek
        Set<Player> treeset = new TreeSet<Player>();

        treeset.add(new Player("Ruslan", 5));
        treeset.add(new Player("Eli", 1));
        treeset.add(new Player("Veli", 50));
        treeset.add(new Player("Yusif", 4));

        for (Player p : treeset) {
            System.out.println(p);

        }
    }
}
