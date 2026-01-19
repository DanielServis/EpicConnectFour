import java.util.Arrays;

public class Board {
    GameLogic GL = new GameLogic();

    private final int ROWS = 6;
    private final int COLS = 7;
    private char[][] grid;

    public Board() {
        grid = new char[ROWS][COLS];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                grid[r][c] = '*';
            }
        }
    }

    public void printBoard() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6");
    }

    public void chipPlace(){
        int Column;
        Column = GL.getCol();

        for(int i =0; i<6; i++){
            if(grid[i][Column] == '*'){
                //GL.plays()
            }
        }

    }

}

