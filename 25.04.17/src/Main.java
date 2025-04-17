import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 0, num = 0;

        System.out.println("음료를 선택하세요: 1-아메리카노(3000원), 2-카페라떼(4000원), 3-카푸치노(4500원)");
        num = sc.nextInt();
        if (num == 1) {
            price = 3000;
        }
        else if (num == 2) {
            price = 4000;
        }
        else if (num == 3) {
            price = 4500;
        }
        else {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        System.out.println("크기를 선택하세요: 1-Small, 2-Medium(+500원), 3-Large(+1000원)");
        num = sc.nextInt();
        if (num == 1) {
        }
        else if (num == 2) {
            price += 500;
        }
        else if (num == 3) {
            price += 1000;
        }
        else {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가(+500원), 3-시럽추가(+300원), 4-샷+시럽추가(+800원)");
        num = sc.nextInt();
        if (num == 1) {

        }
        else if (num == 2) {
            price += 500;
        }
        else if (num == 3) {
            price += 300;
        }
        else if (num == 4) {
            price += 800;
        }
        else {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        System.out.println("최종 가격은 " + price + "원입니다.");

    }
}