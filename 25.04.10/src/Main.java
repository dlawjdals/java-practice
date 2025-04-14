import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하시오: ");
        age = sc.nextInt();

        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("성인이 아닙니다.");
        }
    }
}