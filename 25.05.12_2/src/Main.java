import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int Max_num = 0;

        System.out.printf("숫자를 입력하세요: ");
        Max_num = sc.nextInt();

        for (int i = 1; i <= Max_num; i++) {
            if  (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("홀수의 합: " + sum);
    }
}