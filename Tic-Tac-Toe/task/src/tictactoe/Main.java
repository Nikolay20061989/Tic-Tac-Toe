package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bol=true;
       // System.out.println("Enter cells: ");
       // String ticTacToeStr = scanner.nextLine();
        char[]temp= new char[]{'_','_','_','_','_','_','_','_','_'};
        char[][] ticTacToe = new char[3][3];
      for (int i = 0; i <3 ; i++) {
          for (int j = 0; j < 3; j++) {
              ticTacToe[i][j]='_';
          }
      }
      //temp=[];
      int t=0;
      int x=0;
      int o=0;
      int space = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               ticTacToe[i][j]=temp[t];
               t++;
               switch (ticTacToe[i][j]){
                   case 'X':x++;break;
                   case 'O':o++;break;
                   case '_':space++;break;
               }
            }
        }Draw draw = new Draw();
        fourOutOfFive fourOutOfFiveQ = new fourOutOfFive();
        Impossible impossible = new Impossible();
        FourTwo fourTwo =new FourTwo();
        while (bol) {

            draw.draw(ticTacToe);

            fourOutOfFiveQ.four(ticTacToe);

           bol= impossible.impossible(bol, ticTacToe);
           if(!bol)break;
            fourTwo.fourTwo(ticTacToe);
            bol= impossible.impossible(bol, ticTacToe);
            if(!bol)break;
        }


        }

    }

