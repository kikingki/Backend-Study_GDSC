package exception;

import java.util.Scanner;

public class ThrowExample {
    // 실행 중 발생한 예외의 처리를 해당 로직이 호출부에서 담당 --> 예외의 처리를 미룸
    public void checkChoice(int choice) throws NotFunnyException {
        if(choice == 1) {
            throw new NotFunnyException();      // 직접 만든 예외
        } else {
            System.out.println("저도 집에 가고 싶습니다.");
        }
    }

    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        Scanner scan = new Scanner(System.in);
        System.out.print("Java 스터디는 재미있습니까? (1 Yes / 2 No) : ");
        int choice = scan.nextInt();

        try {
            throwExample.checkChoice(choice);
        } catch (NotFunnyException e) {
            System.out.println("진심을 담아 선택해주세요.");
        }
    }
}

// 직접 예외를 만들어서 내가 생각한 로직과 다르게 실행되는 것을 방지할 수 있음.
class NotFunnyException extends RuntimeException {
    NotFunnyException() {
        super("진짜로 재밌나요?");
    }
}
