
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kor = 0, eng = 0, math = 0, sci = 0;
        double sum = 0.0;

        int intAvg = 0;
        double doubleAvg = 0.0;
        boolean boolResult = false;


        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하시오: ");
        kor = sc.nextDouble();
        System.out.print("영어 점수를 입력하시오: ");
        eng = sc.nextDouble();
        System.out.print("수학 점수를 입력하시오: ");
        math = sc.nextDouble();
        System.out.print("과학 점수를 입력하시오: ");
        sci = sc.nextDouble();

        sum = kor + eng + math + sci;

        intAvg = (int) sum/4;
        doubleAvg = sum/4;

        boolResult = intAvg == doubleAvg;

        System.out.println("총점: " + sum);
        System.out.println("정수 나눗셈 평균: " + intAvg);
        System.out.println("실수 나눗셈 평균: " + doubleAvg);
        System.out.println("===자료형 논리 비교=== \n" + boolResult);


    }
}