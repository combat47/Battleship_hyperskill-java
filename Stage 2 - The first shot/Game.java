package battleship;

public class Game {

    public void start() {
        Battlefield battlefield = new Battlefield();
        battlefield.initField();
        battlefield.makeShot();
    }
}