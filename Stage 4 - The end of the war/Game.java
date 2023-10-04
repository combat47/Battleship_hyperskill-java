package battleship;

public class Game {

    public void start() {
        Player player = new Player();
        player.battlefield.initField();
        System.out.println("The game is starts!");
        player.battlefield.printBattlefield(true);
        System.out.println("Take a shot!");
        player.battlefield.makeShot();
    }
}
