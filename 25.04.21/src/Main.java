import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.printf("입력: ");
        num = sc.nextInt();
        if  (num >= 1 && num <= 100) {
            System.out.printf("출력: 1에서 100 사이의 값입니다.");
        }
        else  {
            System.out.printf("출력: 1에서 100 사이의 값이 아닙니다.");
        }




    }
}