package Average;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class AverageTest {
    public static void main(String[] args) {
        //스캐너 기본 입력
        Scanner sc = new Scanner(System.in);
        Scanner put = new Scanner(System.in);

        //학년 반 입력
        System.out.print("학년 반 입력 : ");
        int grade = sc.nextInt();
        int group = sc.nextInt();
        //학년 반 출력
        System.out.println(grade + "학년 " + group +"반");

        //학생 수 입력
        System.out.print("학생 수 입력 : ");
        int num = sc.nextInt();
        //학생 수 출력
        System.out.println(num + "명");

        //성적 입력
        System.out.print("번호 순으로 성적 입력 : ");
        String[] score = new String[num];
        for(int i = 0; i < num; i++) {
            score[i] = put.next();
        }
        //성적 출력
        int s = 1;
        for(int i = 0; i < num; i++) {
            System.out.print(s++ + "번 : " + score[i] + "점 | ");
        }
        System.out.println();

        //평균 계산
        
        //평균 출력
        System.out.println(grade + "학년 " + group + "반" + num + "명의 평균은" + "입니다.");

        //스캐너 마무리
        sc.close();
    }
}
