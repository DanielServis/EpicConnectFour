public class Board {
    private final int ROWS = Consts.HEIGHT;
    private final int COLS = Consts.WIDTH;
    private Chip[][] grid;

    public Board() {
        grid = new Chip[ROWS][COLS];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                grid[r][c] = null;
            }
        }
    }

    public Chip[][] getGrid() {
        return this.grid;
    }

    public void printBoard() {
        for (Chip[] row : grid) {
            for (Chip cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6");
    }
}

