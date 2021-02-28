package tictactoe;

public class Draw {

   void draw(char  arr[][]){

       System.out.println("---------");
       for (int i = 0; i < 3; i++) {
           System.out.print("| ");
           int zz=0;
           for (int j = 0; j <3 ; j++) {
               if (arr[i][j]=='_') System.out.print("  ");
               else System.out.print(arr[i][j]+" ");
           }
           while ( zz<1){
               System.out.println("|");
               zz++;
           }
       }System.out.println("---------");
   }
}
