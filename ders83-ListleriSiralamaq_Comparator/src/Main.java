
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player {

    private String ad;

    private int id;

    public Player(String ad, int id) {
        this.ad = ad;
        this.id = id;
    }

    public String getIsim() {
        return ad;
    }

    public void setIsim(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " Ad :" + ad + " |||";

    }

}

class BoyukdenKiciyeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2);

    }

}

class KicikdenBoyuyePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;

        } else if (o1.getId() > o2.getId()) {
            return 15;
        }
        return 0;

    }

}

class KicikdenBoyuyeStringPlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {

        return o1.getIsim().compareTo(o2.getIsim());

    }

}

public class Main {

    public static void main(String[] args) {
//         1. örnək BoyukdenKiciyeString
        /*
   BoyukdenKiciyeString verərək sadəcə(- və +) ilə sıraladıq. Ancaq özümüz geriyə -1 və +1 və ya 0
   döndərməklə də sıralaya bilərik. Bunu da KicikdenBoyiye-de etdik
         */
 /*List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list, new BoyukdenKiciyeString());

        for (String s : list) {
            System.out.println(s);
        }*/
//        2. ornek KicikdenBoyuyePlayer öz yazdığımız class
/*
        List<Player> list = new ArrayList<Player>();

        list.add(new Player("Ruslan", 1));
        list.add(new Player("Eli", 3));
        list.add(new Player("Veli", 4));
        list.add(new Player("Azer", 2));

        Collections.sort(list, new KicikdenBoyuyePlayer());
        for (Player s : list) {
            System.out.println(s);
        }
         */
//        3. ornek oz classlarimizi String deyerleri ile qisa ve sade siralamaq
        /* List<Player> list = new ArrayList<>();

        list.add(new Player("Ruslan", 1));
        list.add(new Player("Eli", 3));
        list.add(new Player("Veli", 4));
        list.add(new Player("Azer", 2));

        Collections.sort(list, new KicikdenBoyuyeStringPlayer());
        for (Player s : list) {
            System.out.println(s);
        }*/
//        4. ornek AnonimClass olaraq yazmaq
        List<Player> list = new ArrayList<>();

        list.add(new Player("Ruslan", 1));
        list.add(new Player("Eli", 3));
        list.add(new Player("Veli", 4));
        list.add(new Player("Azer", 2));
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());

            }

        });
        for (Player s : list) {
            System.out.println(s);
        }

    }
}
