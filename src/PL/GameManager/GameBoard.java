package PL.GameManager;

import BL.Tile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameBoard {
    private List<Tile> tiles;

    public GameBoard(Tile[][] board){
        tiles = Arrays.stream(board).flatMap(Arrays::stream).collect(Collectors.toList());
    }

	...

}
