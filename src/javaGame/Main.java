package javaGame;
import java.util.*;
import java.lang.*;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {


        // GAME ARRAY
        int[][] game = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };

//        for (int i = 0; i < 5; i++) {
//            System.out.println("" +game[i][0] + "\t" + game[i][1] + "\t" + game[i][2] + "\t" + game[i][3] + "\t" + game[i][4]);
//        }


        //add final point with a random variable, if [X][Y] == [Fx][Fy] break;
        int comand;
        Random Rx = new Random();
        Random Ry = new Random();
        int finalX = Rx.nextInt((4 - 1) + 1) + 1, finalY = Ry.nextInt((4 - 1) + 1) + 1;         //add random finalX , finalY;
        boolean flag = true;
        int positionX = 2 , positionY = 2;
        //  horizontal      vertical



        game[finalX][finalY] = 2;

        while(flag){
            game[positionX][positionY] = 1;
            for (int i = 0; i < 5; i++) {
                System.out.println("" +game[i][0] + "\t" + game[i][1] + "\t" + game[i][2] + "\t" + game[i][3] + "\t" + game[i][4]);
            }
            if(game[positionX][positionY] == game[finalX][finalY]){
                break;
            }
            comand = input.nextInt();       // W = 8, A = 4, S = 2, D = 6;
            game[positionX][positionY] = 0;
            if(comand == 8){                                            //modify: from IF to SWITCH CASE
                positionX--;
            }else if(comand == 2){
                positionX++;
            }else if(comand == 4){
                positionY--;
            }else if(comand == 6){
                positionY++;
            }else if(comand == 9){
                positionX--;
                positionY++;
            }else if(comand == 7){
                positionY--;
                positionX--;
            }else if(comand == 1){
                positionX++;
                positionY--;
            }else if(comand == 3){
                positionX++;
                positionY++;
            }
        }
        System.err.println("finish");


//        game[positionY][positionX] = 1;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(game[i][0] + "\t" + game[i][1] + "\t" + game[i][2] + "\t" + game[i][3] + "\t" + game[i][4]);
//        }



    }
}