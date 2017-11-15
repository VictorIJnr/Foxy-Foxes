public class Board {

    // The following five constants were defined in the starter code (kt54)
    private static final int  DEFAULT_SIZE = 7;
    static final char FREE    = '.';
    static final char INVALID = ' ';
    static final char FOX     = '*';
    static final char GOOSE   = 'o';

    private int boardsize;
    private char[][] board;

    // Default constructor was provided by the starter code. Extend as needed (kt54)
    public Board() {
        this.boardsize = DEFAULT_SIZE;

        board = new char[boardsize][boardsize];

        // Clear all playable fields
        for(int x=0; x<boardsize; x++)
            for(int y=0; y<boardsize; y++)
                board[x][y] = FREE;

        // Put a single fox in the middle
        //Gen geese
        for (int i = 0; i <= boardsize / 2; i++) {
            for (int j = 0; j < boardsize; j++) {
                if(!(i == boardsize/2 && j >= boardsize/2 - 1 && j <= boardsize/2 + 1)) board[j][i] = GOOSE;
            }
        }


        for (int i = 0; i < boardsize; i++)
            for (int j = 0; j < boardsize; j++)
                if ((i < boardsize / 2 - 1 || i > boardsize/2 + 1) && (j < boardsize / 2 - 1 || j > boardsize/2 + 1))
                    board[i][j] = INVALID;

        //board[boardsize/2][boardsize/2 + 2] = FOX;
        board[3][0] = FOX;
    }

    // Prints the board. This method was provided with the starter code. Better not modify to ensure
    // output consistent with the autochecker (kt54)
    public void printBoard() {

        for(int y=0; y<boardsize; y++)
        {
            for(int x=0; x<boardsize; x++) {
                System.out.print(" ");
                switch(board[x][y]) {
                    case FREE: 
                        System.out.print(".");
                        break;
                    case FOX:
                        System.out.print("*");
                        break;
                    case GOOSE:
                        System.out.print("o");
                        break;
                    default:
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
}
