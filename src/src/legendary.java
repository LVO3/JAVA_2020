import java.util.Scanner;
public class legendary {
    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임");
        System.out.println("가위:1, 바위:2, 보:3");

        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();

        double randomValue = Math.random();
        int intValue = (int)(randomValue * 3) + 1;

        System.out.println("플레이어 : " + player);
        System.out.println("컴퓨터 : " + intValue);
    }
}
