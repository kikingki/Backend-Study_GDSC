package exception;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int result;

        // try - 검사할 로직, catch - 예외 처리, finally - 무조건 실행
        try {
            result = A/B;
            System.out.println(result);
        } catch (ArithmeticException e) {       // 발생할 수 있는 예외를 예측하고 그에 대한 처리를 머리 작성
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("정말 재미있는 Java 스터디!");
        }
    }
}
