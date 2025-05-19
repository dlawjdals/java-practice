import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.printf("점수를 입력하세요 (종료하려면 음수를 입력): ");
            num = sc.nextInt();

            if (num < 0) break;
            sum += num;
        }

        if (sum == 0) {
            System.out.println("입력된 점수가 없습니다.");
            return;
        }

        System.out.println("점수들의 총합은: " + sum);
    }
}