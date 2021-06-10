package PL.GameManager;

import BL.Tiles.Units.Enemy;
import BL.Tiles.Units.Player;

import java.util.ArrayList;
import java.util.List;

public class GameLevel {
    private GameBoard gameBoard;
    private Player player;
    private List<Enemy> enemies;

    public GameLevel(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
        this.enemies = new ArrayList<>();
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public void onPlayerDeath(){
		...
    }

    public void onEnemyDeath(Enemy e){
        ...
    }

    @Override
    public String toString() {
        return String.format("%s\n%s", gameBoard, player.describe());
    }

}
