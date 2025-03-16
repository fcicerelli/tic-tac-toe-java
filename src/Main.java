import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);
  public static String [][] tt = new String [3][3];
  public static String playerX = "X";
  public static String playerO = "O";

  public static void emptyBoard() {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        tt[i][j] = "   ";
      }
    }
  }

  public static void drawBoard() {
    for(int i = 0; i < 3;i++) {
      //System.out.print("|");
      for(int j = 0; j < 3; j++) {
        System.out.print(tt[i][j]);
        if(j<2) {
          System.out.print("|");
        }
      }
      System.out.println();
      if(i<2) {
        System.out.println("---+---+---");
      }
    }
  }

  public static void playerXTurn() {
    while(true) {
      System.out.println("Player X's turn");
      System.out.println();

      System.out.println("Enter the row: (1-3)");
      int row = scanner.nextInt();

      System.out.println("Enter the column: (1-3)");
      int column = scanner.nextInt();

      if (tt[row-1][column-1].equals("   ")) {
        tt[row-1][column-1] = " " + playerX + " ";
      } else {
        System.out.println("You cannot play that box");
        continue;
      }

      drawBoard();
      break;
    }
  }

  public static void playerOTurn() {
    while(true) {
      System.out.println("Player O's turn");
      System.out.println();

      System.out.println("Enter the row: (1-3)");
      int row = scanner.nextInt();

      System.out.println("Enter the column: (1-3)");
      int column = scanner.nextInt();

      if (tt[row-1][column-1].equals("   ")) {
        tt[row-1][column-1] = " " + playerX + " ";
      } else {
        System.out.println("You cannot play that box");
        continue;
      }

      drawBoard();
      break;
    }
  }

  public static void main(String[] args) {

    while(true) {
      System.out.println("Welcome to Tic Tac Toe");
      System.out.println();

      System.out.println("Press 'n' for new game or 'q' tu quit");

      String quit = scanner.nextLine();

      if (quit.equals("q")) {
        System.out.println("Exitting...");
        break;
      } else if (quit.equals("n")) {

        emptyBoard();
        drawBoard();

        while(true) {
          if (!(tt[0][0].equals("   ")) && !(tt[0][1].equals("   ")) && !(tt[0][2].equals("   ")) &&
              !(tt[1][0].equals("   ")) && !(tt[1][1].equals("   ")) && !(tt[1][2].equals("   ")) &&
              !(tt[2][0].equals("   ")) && !(tt[2][1].equals("   ")) && !(tt[2][2].equals("   "))) {
            System.out.println("Game Over!!!");
            break;
          }

          playerXTurn();
          System.out.println();

        }
      } else {
        System.out.println("Invalid Character");
        continue;
      }
    } // end while
  } // end main
}
