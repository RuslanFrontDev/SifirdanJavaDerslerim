
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Player {

    private String ad;
    private int id;

    public Player(String ad, int id) {
        this.ad = ad;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " İsim :" + ad + " |||";

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.ad);
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.ad, other.ad);
    }

}

public class Main {

    public static void main(String[] args) {

        Set<Player> player_list = new HashSet<Player>();

        Player player1 = new Player("Ruslan", 1);
        Player player2 = new Player("Eli", 10);
        Player player3 = new Player("Serxan", 6);
        Player player4 = new Player("Ruslan", 1);

        player_list.add(player1);
        player_list.add(player2);
        player_list.add(player3);
        player_list.add(player4);
        for (Player p : player_list) {
            System.out.println(p);
        }

    }

}
