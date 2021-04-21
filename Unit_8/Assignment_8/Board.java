package Unit_8.Assignment_8;

import java.util.Arrays;

public class Board {

  private String[][] squares = new String[10][10];

  public Board() {
    for (int i = 0; i < squares.length; i++) {
      for (int j = 0; j < squares[i].length; j++) {
        squares[i][j] = "-";
      }
    }
  }

  public String toString() {
    // prints nested arrays
    return Arrays.deepToString(squares).replace("], ", "\n").replace("[", "").replace("]", "").replace(",", "");
  }

  public boolean addShip(int row, int col, int len, boolean horizontal) {
    // bounds check
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length) {
      return false;
    }

    if (horizontal) {
      // col =9 (0-9) len = 3 below
      // | - - - - - - - - - b | /b/ /b/
      if (col + len > squares.length) {
        return false;
      }

      // ship detection
      for (int c = col; c < col + len; c++) {
        if (!squares[row][c].equals("-")) {
          return false;
        }
      }

      // place ship
      for (int c = col; c < col + len; c++) {
        squares[row][c] = "b";
      }
    } else {

      if (row + len > squares.length) {
        return false;
      }

      for (int r = row; r < row + len; r++) {
        if (!squares[r][col].equals("-")) {
          return false;
        }
      }

      for (int r = row; r < row + len; r++) {
        squares[r][col] = "b";
      }
    }
    return true;
  }

  public boolean foundShip(int len) {
    // h
    // for each array
    for (int i = 0; i < squares.length; i++) {
      int count = 0;
      // until the end of the array
      while (count < squares[0].length) {
        int found = 0;
        // enter if squares[i][c] is b, tick one time if not, and tick and
        // inc if true
        while (squares[i][count].equals("b")) {
          found++;
          count++;
        }
        // len = 3 below
        // if the amount of boats with len 3 is equal to 3 return true
        if (found == len) {
          return true;
        }
        found = 0;
        count++;
      }
    }

    // v
    for (int j = 0; j < squares[0].length; j++) {
      int count = 0;
      // until the end of the array
      while (count < squares.length) {
        int found = 0;
        // enter if squares[i][c] is b, tick one time if not, and tick and
        // inc if true
        while (squares[count][j].equals("b")) {
          found++;
          count++;
        }
        // len = 3 below
        // if the amount of boats with len 3 is equal to 3 return true
        if (found == len) {
          return true;
        }
        found = 0;
        count++;
      }
    }
    return false;
  }

  public int shoot(int row, int col) {
    // bounds
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length) {
      return -1;
    }

    // miss
    if (squares[row][col].equals("-")) {
      squares[row][col] = "m";
      return 0;
    }

    // hit
    if (squares[row][col].equals("b")) {
      squares[row][col] = "x";
      return 1;
    }

    return 2;
  }

  public boolean gameOver() {
    for (int i = 0; i < squares.length; i++) {
      for (int j = 0; j < squares[0].length; j++) {
        if (squares[i][j].equals("b")) {
          return false;
        }
      }
    }
    return true;
  }

}
