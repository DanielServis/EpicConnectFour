


public class WinCheck {
  // returns 0 for game not over, 1 for red wins, 2 for yellow wins, 3 board full (draw)
  public static int checkWinner(Board board, int lastMoveCol) {
    Chip[][] grid = board.getGrid();
    
    // find last placed piece coords
    int lastMoveRow = 0;
    for (int i = 0; i < Consts.HEIGHT; i++) {
      if (grid[i][lastMoveCol] != null) {
        lastMoveRow = i;
        break;
      }
    }
    boolean isRed = grid[lastMoveRow][lastMoveCol].getRed();

    int length;
    // check for fours in each direction: down, sides, diagonals
    // down
    length = 1;
    for (int i = 1; i < 4; i++) {
      if (grid[lastMoveRow + i][lastMoveCol].getRed() == isRed) {
        length += 1;
      } else {
        break;
      }
    }
    if (length == 4) {
      return isRed ? 1 : 2;
    }

    // sides
    length = 1;
    for (int i = 0; i < 4; i++) {
      if (grid[lastMoveRow][lastMoveCol + i ].getRed() == isRed) {
        length += 1;
      } else {
        break;
      }
    }
    for (int i = 0; i < 4; i++) {
      if (grid[lastMoveRow][lastMoveCol - i ].getRed() == isRed) {
        length += 1;
      } else {
        break;
      }
    }
    if (length == 4) {
      return isRed ? 1 : 2;
    }

    // diagonal 1
    length = 1;

    // check if board is full
    boolean full = true;
    for (int j = 0; j < Consts.WIDTH; j++) {
      if (grid[0][j] == null) {
        full = false;
      }
    }
    if (full) { return 3;}
    
    // otherwise continue the game
    return 0;
  }
}