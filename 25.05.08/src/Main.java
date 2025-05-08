import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.printf("점수를 입력하세요: ");
        score = sc.nextInt();

        switch (score/10) {
            case 10:
            case 9:
                System.out.printf("A학점");
                break;
            case 8:
                System.out.printf("B학점");
                break;
            case 7:
                System.out.printf("C학점");
                break;
            case 6:
                System.out.printf("D학점");
                break;
            default:
                System.out.printf("F학점");
                break;

        }

    }
}