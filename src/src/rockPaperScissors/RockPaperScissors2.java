package rockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors2 {
    public static void main(String[] args) {
        //Math.random을 사용한 가위바위보 프로그램 작성
        //가위:1, 바위:2, 보:3로 값을 지정한 후 플레이어의 입력과 컴퓨터의 랜덤 값의 차(알고리즘)를 구하여 switch case문을
        //통하여 완성시킨 가위바위보 프로그램이다.
        int computer;
        System.out.println("-----가위:1, 바위:2, 보:3 중 하나를 입력하세요-----");

        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();

        computer = (int)(Math.random() * 3) + 1;

        System.out.println("당신은" + player + "입니다.");
        System.out.println("컴퓨터는" + computer + "입니다.");

        switch(player-computer) {
            case 2: case -1:
                System.out.println("LOSE");
                break;
            case 1: case -2:
                System.out.println("WIN");
                break;
            case 0:
                System.out.println("DRAW");
                break;
        }
    }
}
