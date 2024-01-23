package backjun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        // a 변수 입력 받기
        while (true) {
            try {
                System.out.print("a 변수를 입력하세요: ");
                a = scanner.nextInt();
                break; // 숫자를 정상적으로 입력받으면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해야 합니다. 다시 입력하세요.");
                scanner.next(); // 잘못된 입력값을 제거하고 다음 입력을 받습니다.
            }
        }

        // b 변수 입력 받기
        while (true) {
            try {
                System.out.print("b 변수를 입력하세요: ");
                b = scanner.nextInt();
                break; // 숫자를 정상적으로 입력받으면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해야 합니다. 다시 입력하세요.");
                scanner.next(); // 잘못된 입력값을 제거하고 다음 입력을 받습니다.
            }
        }

        // 입력받은 두 변수를 더하여 결과를 계산합니다.
        int 합계 = a + b;

        // 결과를 출력합니다.
        System.out.println("두 변수의 합계는: " + 합계);

        scanner.close();
    }
}
