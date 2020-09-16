package RockPaperScissors;

import java.util.Scanner;
public class RockPaperScissors1 {
    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임");
        System.out.println("가위:1, 바위:2, 보:3");

        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();

        double randomValue = Math.random();
        int intValue = (int)(randomValue * 3) + 1;

        System.out.println("플레이어 : " + player);
        System.out.println("컴퓨터 : " + intValue * -1);


//  2중 switcch 문
//        switch(player) {
//            case 1 :
//                switch(intValue) {
//                    case 1 :
//                        System.out.println("DRAW");
//                        break;
//                    case 2 :
//                        System.out.println("LOSE");
//                        break;
//                    case 3 :
//                        System.out.println("WIN");
//                        break;
//            }
//            break;
//            case 2 :
//                switch(intValue) {
//                    case 1:
//                        System.out.println("WIN");
//                        break;
//                    case 2:
//                        System.out.println("DRAW");
//                        break;
//                    case 3:
//                        System.out.println("LOSE");
//                        break;
//                }
//            break;
//            case 3 :
//                switch(intValue) {
//                    case 1 :
//                        System.out.println("LOSE");
//                        break;
//                    case 2 :
//                        System.out.println("WIN");
//                        break;
//                    case 3 :
//                        System.out.println("DRAW");
//                        break;
//                }
//            break;
//        }
        switch(player-intValue) {
        }
        sc.close();
    }
}
