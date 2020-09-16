package UpDownGame;
import java.util.Scanner;
public class UpDownGame {
    public static void main(String[] args) {
        System.out.println("1~100의 숫자 중 한가지를 맞춰보세요.");
        int computer;
        Scanner sc = new Scanner(System.in);
        int user;
        computer = (int)(Math.random() * 100) + 1;
        System.out.println(computer);
        do {
            user = sc.nextInt();
            //System.out.println(user);
            if(user > computer){
                System.out.println("더 작다");
            }
            else if(user < computer) {
                System.out.println("더 크다");
            }
        }while(user !=computer);
        System.out.println("딩동댕");
        sc.close();
    }
}
