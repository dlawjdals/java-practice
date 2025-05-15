import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        for (int n = 1; n <= 1000; n++) {

            System.out.printf("1부터 100사이의 숫자를 입력하세요: ");
            num = sc.nextInt();

            if (1 <= num && num <= 100) {
                System.out.printf("입력 완료! 프로그램을 종료합니다. ");
                break;
            }
        }
    }
}