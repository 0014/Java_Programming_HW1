package TicTacToe;

import java.util.Scanner;

public class tic_tac_toe {
    private enum gamePlay{X,O,EMPTY};
    private enum playStatus{win,empty};
    static playStatus playerOne = playStatus.empty ;
    static playStatus playerTwo = playStatus.empty ;
    static gamePlay[][] board = new gamePlay[4][4];
    static Scanner input = new Scanner(System.in);
    static int row,column;
    static gamePlay a,b,c;

    public tic_tac_toe(){
        for(gamePlay[] x:board){
            for(gamePlay y:x) 
            	y = gamePlay.EMPTY;
        }
    }
    
    public static void setplayerOne() {
        System.out.println("player one please enter the row you want to place");
        row = input.nextInt();
        System.out.println("and enter the column you want to place");
        column = input.nextInt();
        board[row][column] = gamePlay.X;
    }
    
    public static void setPlayerTwo(){
        System.out.println("player two please enter the row you want to place");
        row = input.nextInt();
        System.out.println("and enter the column you want to place");
        column = input.nextInt();
        board[row][column] = gamePlay.O;
    }
    
    public static void winOrLoose() {
        for(row=1;row<=3;row++){
            a = board[row][1];
            b = board[row][2];
            c = board[row][3];
           
            if((a==b)&&(a==gamePlay.X)&&(a==c)) {
                System.out.println("player one win");
                playerOne = playStatus.win;
                break;
            }
            if ((a==b)&&(a==gamePlay.O)&&(a==c)){
                System.out.println("player two win");
                playerTwo = playStatus.win;
                break;
            }
        }

        for(column=1;column<=3;column++){
            a = board[1][column];
            b = board[2][column];
            c = board[3][column];
  
            if((a==b)&&(a==gamePlay.X)&&(a==c)) {
                System.out.println("player one win");
                playerOne = playStatus.win;
                break;
            }
            if ((a==b)&&(a==gamePlay.O)&&(a==c)){
                System.out.println("player two win");
                playerTwo = playStatus.win;
                break;
            }
        }

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
    
    public static void main(String[]args){
        do{
            setplayerOne();
            winOrLoose();
            if((playerOne == playStatus.win) || (playerTwo == playStatus.win))
                   break;
            else {
                setPlayerTwo();
                winOrLoose();
            }
        }while((playerTwo==playStatus.empty)&&(playerOne==playStatus.empty));
    }
}
