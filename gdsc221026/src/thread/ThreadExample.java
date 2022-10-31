package thread;

import java.util.ArrayList;

public class ThreadExample extends Thread {   // Thread 클래스 상속 --> 단점: 다른 클래스 상속 불가
    private int order;
    public ThreadExample(int order) { this.order = order; }
    
    // run 메소드 오버라이딩
    @Override
    public void run() {
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.order +  "번째 스레드 종료합니다.");
    }

    // main 메소드
    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i = 1; i <= 10 ; i++) {
            Thread thread = new ThreadExample(i);
            thread.start();         // 스레드는 순서대로 실행되지 않음.
            threadList.add(thread);
        }

        for(int i = 0; i < threadList.size() ; i++) {
            Thread thread = threadList.get(i);
            try {
                // 자신을 호출한 스레드가 종료될 떄까지 대기하여 main이 먼저 종료되는 문제 해결
                thread.join();
            } catch (Exception e) {
            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}
