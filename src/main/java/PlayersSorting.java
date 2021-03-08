import java.util.Comparator;

public class PlayersSorting {


}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
            if (a.score == b.score){
                return a.name.compareTo(b.name);
            }
            if (a.score > b.score)
                return 10;
            else return -1;
    }
}
