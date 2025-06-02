import java.util.Scanner;

public class Main {
    int radius;

    public void setRadius() {
        radius = inputNumber();
    }

    public int inputNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("숫자를 입력하세요: ");
        radius = sc.nextInt();
        return radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public void printCircleInfo() {
        System.out.println("반지름: " + radius);
        System.out.println("넓이: " + calculateArea());
    }

    public static void main (String[] args)
    {
        Main main = new Main();
        main.setRadius();
        main.printCircleInfo();
    }
}