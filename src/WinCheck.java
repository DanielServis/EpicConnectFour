


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
    // check for fours in each direction: down, sides, diagonal + and -
    // down
    int length = 1;
    for (int i = 1; i < 4 && lastMoveRow + i < Consts.HEIGHT; i++) {
      Chip chip = grid[lastMoveRow + i][lastMoveCol];
      if (chip != null && chip.getRed() == isRed) {
        length++;
      } else {
        break;
      }
    }
    if (length >= 4) {
      return isRed ? 1 : 2;
    }

    // sides
    length = 1;
    for (int i = 1; i < 4 && lastMoveCol + i < Consts.WIDTH; i++) {
      Chip chip = grid[lastMoveRow][lastMoveCol + i ];
      if (chip != null && chip.getRed() == isRed) {
        length++;
      } else {
        break;
      }
    }
    for (int i = 1; i < 4 && lastMoveCol - i >= 0; i++) {
      Chip chip = grid[lastMoveRow][lastMoveCol - i ];
      if (chip != null && chip.getRed() == isRed) {
        length++;
      } else {
        break;
      }
    }
    if (length >= 4) {
      return isRed ? 1 : 2;
    }

    // diagonal +
    length = 1;
    for (int i = 1; i < 4 && lastMoveRow - i >= 0 && lastMoveCol + i < Consts.WIDTH; i++) {
      Chip chip = grid[lastMoveRow - i][lastMoveCol + i];
      if (chip != null && chip.getRed() == isRed) {
        length++;
      } else {
        break;
      }
    }
    for (int i = 1; i < 4 && lastMoveRow + i < Consts.HEIGHT && lastMoveCol - i >= 0; i++) {
      Chip chip = grid[lastMoveRow + i][lastMoveCol - i];
      if (chip != null && chip.getRed() == isRed) {
        length++;
      } else {
        break;
      }
    }
    if (length >= 4) {
      return isRed ? 1 : 2;
    }

    // diagonal -
    length = 1;
    for (int i = 1; i < 4 && lastMoveRow + i < Consts.HEIGHT && lastMoveCol + i < Consts.WIDTH; i++) {
      Chip chip = grid[lastMoveRow + i][lastMoveCol + i];
      if (chip != null && chip.getRed() == isRed) {
        length++;
      } else {
        break;
      }
    }
    for (int i = 1; i < 4 && lastMoveRow - i >= 0 && lastMoveCol - i >= 0; i++) {
      Chip chip = grid[lastMoveRow - i][lastMoveCol - i];
      if (chip != null && chip.getRed() == isRed) {
        length++;
      } else {
        break;
      }
    }
    if (length >= 4) {
      return isRed ? 1 : 2;
    }

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