package battleship;

public class Game {

    public void start() {
        Player player = new Player();
        player.battlefield.initField();
        player.battlefield.makeShot();
    }
}
