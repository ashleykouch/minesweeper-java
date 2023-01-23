public class PrintBoard {
   
    // loop through user inpout and display board in console
     public static void printBoard() {
            for (int i = 0; i < MinesweeperGame.rows; i++) {
                for (int j = 0; j < MinesweeperGame.cols; j++) {
                    System.out.print(MinesweeperGame.gameboard[i][j] + " ");
                }
                System.out.println();
            }
        }
}
