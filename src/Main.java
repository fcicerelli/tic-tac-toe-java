import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    emptyBoard();
  }

  public static Scanner scanner = new Scanner(System.in);
  public static String [][] tt = new String [3][3];
  public static String playerX = "X";
  public static String playerO = "O";

  public static void emptyBoard() {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; i < 3; i++) {
        tt[i][j] = " _ ";

      }

    }
    for(int i = 0; i < 3;i++) {
      System.out.print("|");
      for(int j = 0; i < 3; i++) {
        System.out.print(tt[i][j]);
        System.out.print("|");
      }
      System.out.println();
    }
  }
}
