import java.util.Scanner;

public class MinesweeperGame {

    static int rows;
    static int cols;
    static int mines;
    static char[][] gameboard;
    static boolean[][] mine;

    public static void main(String[] args) throws Exception {
       // welcome sign
        System.out.println("\n ****** Welcome to Minesweeper ****** \n");

        // obtain user input for the desired game board
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter desired number of columns: ");
        cols = sc.nextInt();
        System.out.print("Enter desired number of mines to be placed on the board: ");
        mines = sc.nextInt();

        // initialise the gameboard 
        gameboard = new char[rows][cols];
        mine = new boolean[rows][cols];
        // loop through board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                gameboard[i][j] = '-';
            }
        }

        // randomise mine locations
        for(int i = 0; i < mines; i++) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);
            if (!mine[row][col]) {
                mine[row][col] = true;
            } else {
                i--;
            }
        }
    

         // main game initialisation

         while(true) {
            PrintBoard.printBoard();
            System.err.println("\n Note the 1st row and 1st column are defined as 0 \n");
            System.out.print("Enter row number: ");
            int row = sc.nextInt();
            System.out.print("Enter column number: ");
            int col = sc.nextInt();
            if (mine[row][col]) {
                System.out.println("Boom! You just hit a mine! Game over...");
                break;
            } else {
                Reveal.reveal(row, col);
                if(GameWon.isWon()) {
                    System.out.println("Congratulations, you won and survived!");
                    break;
                }
            }
         }

        }
    }

