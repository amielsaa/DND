package PL.GameManager;

import BL.Position;
import BL.Tiles.Empty;
import BL.Tiles.Units.Enemy;
import BL.Tiles.Units.Player;
import BL.Tiles.Wall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileParser {

    public FileParser() {

    }


    public GameLevel parseLevel(File levelFile){

        char[][] arr = fileToChar(levelFile);
        GameBoard b = ...
        GameLevel m = ...
        for(int i=0;i<arr.length;i++){
            for(int j=0;i<arr[i].length;j++){
                Position p = new Position(i, j);
                if(arr[i][j] == '#')
                    b.add(new Wall(p));


            }
        }



				else if arr[i][j] == '.'
        board.add(new Empty(p))
				else if arr[i][j] == '@'
        Player p = ...
				else
        Enemy e = new Enemy(p, ....)
        e.setDeathCallback(() -> m.onEnemyDeath(e));
        e.setMessageCallback((msg) -> System.out.println(msg));
        // Equivalent to lambda expression:
        // new EnemyDeathCallback(){
        //	public void call(){
        //		m.removeEnemy(e)
        //	}
        //}

        board.add(e)
    }

    public char[][] fileToChar(File levelFile) {


        Scanner scanner = null;
        try {
            scanner = new Scanner(levelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String theString = "";
        theString = scanner.nextLine();

        int y_axis = 1;
        int x_axis = theString.length();
        int offset = 0;

        while (scanner.hasNextLine()) {
            theString = theString + "\n" + scanner.nextLine();
            y_axis++;
        }

        char[][] arr = new char[y_axis][x_axis];
        for(int i =0;i<y_axis;i++) {
            for(int j=0;j<x_axis;j++) {
                arr[i][j] = theString.charAt(offset);
                offset++;
            }
            offset++;
        }
        return arr;
    }




}
