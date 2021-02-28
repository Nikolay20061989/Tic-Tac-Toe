package tictactoe;

public class Impossible {
    int a=0;
    int b=0;
    int c=0;

//int x,int o, int space,
   boolean impossible(boolean bol, char[][] ticTacToe){
int space=0;
boolean boL =bol;
       for (int i = 0; i <3 ; i++) {
           for (int j = 0; j <3; j++) {
               if(ticTacToe[i][j]=='_') space++;
           }
       }
   //   if ((x-o>1)||(o-x>1)) {
   //     System.out.println("Impossible");
   // return;}
       if((ticTacToe[0][0]=='X')&&(ticTacToe[0][1]=='X')&&(ticTacToe[0][2]=='X')||
       (ticTacToe[1][0]=='X')&&(ticTacToe[1][1]=='X')&&(ticTacToe[1][2]=='X')||
       (ticTacToe[2][0]=='X')&&(ticTacToe[2][1]=='X')&&(ticTacToe[2][2]=='X')||
       (ticTacToe[0][0]=='X')&&(ticTacToe[1][0]=='X')&&(ticTacToe[2][0]=='X')||
       (ticTacToe[0][1]=='X')&&(ticTacToe[1][1]=='X')&&(ticTacToe[2][1]=='X')||
       (ticTacToe[0][2]=='X')&&(ticTacToe[1][2]=='X')&&(ticTacToe[2][2]=='X')||
       (ticTacToe[0][0]=='X')&&(ticTacToe[1][1]=='X')&&(ticTacToe[2][2]=='X')||
       (ticTacToe[0][2]=='X')&&(ticTacToe[1][1]=='X')&&(ticTacToe[2][0]=='X')
       ){
           a=1;
       } if((ticTacToe[0][0]=='O')&&(ticTacToe[0][1]=='O')&&(ticTacToe[0][2]=='O')||
               (ticTacToe[1][0]=='O')&&(ticTacToe[1][1]=='O')&&(ticTacToe[1][2]=='O')||
               (ticTacToe[2][0]=='O')&&(ticTacToe[2][1]=='O')&&(ticTacToe[2][2]=='O')||
               (ticTacToe[0][0]=='O')&&(ticTacToe[1][0]=='O')&&(ticTacToe[2][0]=='O')||
               (ticTacToe[0][1]=='O')&&(ticTacToe[1][1]=='O')&&(ticTacToe[2][1]=='O')||
               (ticTacToe[0][2]=='O')&&(ticTacToe[1][2]=='O')&&(ticTacToe[2][2]=='O')||
               (ticTacToe[0][0]=='O')&&(ticTacToe[1][1]=='O')&&(ticTacToe[2][2]=='O')||
               (ticTacToe[0][2]=='O')&&(ticTacToe[1][1]=='O')&&(ticTacToe[2][0]=='O')
       ){
           b=1;
       }
       //else System.out.println("Draw");
       //Game not finished
       if(a+b>1) System.out.println("Impossible");
       else if(a==1){
           System.out.println("X wins");
           boL=false;
       } else if(b==1){
           System.out.println("O wins");
           boL=false;
       }else if (space==0){
           System.out.println("Draw");
           boL=false;
       }//else if(space>0) System.out.println("Game not finished");
return boL;
   }
}
