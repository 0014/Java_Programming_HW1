package TicTacToe;
import java.util.Scanner;

public class tic_tac_toe {
   private enum gamePlay{X,O,EMPTY};//create an enum to store the three kinds of status of the cell
    private enum playStatus{win,empty};//two status of players.
    static playStatus playerOne = playStatus.empty ;//set player's default status as empty
    static playStatus playerTwo = playStatus.empty ;
    static gamePlay[][] board = new gamePlay[4][4];//create the 3x3 "play board" of the game
   static Scanner input = new Scanner(System.in);
    static int row,column;
   
//set all cell to empty to start the game
    public tic_tac_toe(){
        for(gamePlay[] x:board){
            for(gamePlay y:x) {
                y = gamePlay.EMPTY;
            }
        }
    }
    //let the player one set the row number and column number of the cell he want to place
    public static void setplayerOne() {
        System.out.println("player one please enter the row you want to place");
        row = input.nextInt();
        System.out.println("and enter the column you want to place");
        column = input.nextInt();
        board[row][column] = gamePlay.X;// set the cell player one chosen to be X
    }
    //let the player two set the row number and column number of the cell he want to place
    public static void setPlayerTwo(){
        System.out.println("player two please enter the row you want to place");
        row = input.nextInt();
        System.out.println("and enter the column you want to place");
        column = input.nextInt();
        board[row][column] = gamePlay.O;//set the cell player two chosen to be O
    }
    
    //determine which one win
    public static void winOrLoose() {
    	gamePlay a,b,c;                                  
        for(row=1;row<=3;row++){   /*loop through all cells of row one two and three*/
            a = board[row][1];     /*store the value of cells in a, b and c*/ 
            b = board[row][2];
            c = board[row][3];
      
            if((a==b)&&(a==gamePlay.X)&&(a==c)) {     /*if all cells of every row equal to X*/
                System.out.println("player one win");/*player-one win*/
                playerOne = playStatus.win;/*set player-one's status to win*/
                break;
            }
            
            if ((a==b)&&(a==gamePlay.O)&&(a==c)){    /*if all cells of every row equal to O*/
                System.out.println("player two win");/*player-two win*/
                playerTwo = playStatus.win;//set player-two's status to win
                break;
            }
        }


        for(column=1;column<=3;column++){      /*loop through all cells of column one two and three*/
            a = board[1][column];
            b = board[2][column];
            c = board[3][column];
            
            if((a==b)&&(a==gamePlay.X)&&(a==c)) {      /*if all cells of every column equal to X*/
                System.out.println("player one win");/*player-one win*/
                playerOne = playStatus.win;/*set player-one's status to win*/
                break;
            }
            if ((a==b)&&(a==gamePlay.O)&&(a==c)){    /*if all cells of every column equal to O*/
                System.out.println("player two win");/*player-two win*/
                playerTwo = playStatus.win;//set player-two's status to win
                break;
            }
        }

        //check the diagonal cells if they are X, player-one win, if they are O, player-two win
        if ((board[1][1] == gamePlay.X) && (board[2][2] == gamePlay.X) && (board[3][3] == gamePlay.X)) {
            System.out.println("player one win");
            playerOne = playStatus.win;
        }
        if ((board[1][1] == gamePlay.O) && (board[2][2] == gamePlay.O) && (board[3][3] == gamePlay.O)) {
            System.out.println("player two win");
            playerTwo = playStatus.win;
        }
        if ((board[3][1] == gamePlay.X) && (board[2][2] == gamePlay.X) && (board[1][3] == gamePlay.X)) {
            System.out.println("player one win");
            playerOne = playStatus.win;
        }
        if ((board[3][1] == gamePlay.O) && (board[2][2] == gamePlay.O) && (board[1][3] == gamePlay.O)) {
            System.out.println("player two win");
            playerTwo = playStatus.win;
        }
    }
    
    //main method.
        public static void main(String[]args){

            do{
                setplayerOne();//player-one's turn
                winOrLoose();//check win or loose
                if((playerOne == playStatus.win) || (playerTwo == playStatus.win))
                       break;//if any one win game over
                else {
                    setPlayerTwo();//player-two's turn
                    winOrLoose();//check win or loose
                }
    }while((playerTwo==playStatus.empty)&&(playerOne==playStatus.empty));//if no one win keep playing
            
}
}
