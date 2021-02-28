package tictactoe;

import java.util.Scanner;

public class FourTwo {
    void fourTwo(char arr[][]){
        System.out.println("Enter the coordinates:");
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int b= 0;

        while ((a != 1) && (a != 2) && (a != 3)||(b != 1) && (b != 2) && (b != 3)) {
            try {
                a = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();

            }
            try {
                b = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();

            }
            if((a != 1) && (a != 2) && (a != 3)) System.out.println("Coordinates should be from 1 to 3!");
            if((b != 1) && (b != 2) && (b != 3)) System.out.println("Coordinates should be from 1 to 3!");

            if((a == 1) || (a == 2) || (a == 3)){
                if((b == 1) || (b == 2) || (b == 3)){
                    if (arr[a-1][b-1]=='_'){ arr[a-1][b-1]='O';
                        Draw draw = new Draw();
                        draw.draw(arr);}else if (arr [a-1][b-1]!='_'){
                        System.out.println("This cell is occupied! Choose another one!");
                        a=0;b=0;}
                }}

        }



    }}

