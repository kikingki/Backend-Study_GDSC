package thread;

import java.util.ArrayList;

public class RunnableExample implements Runnable {   // Runnable 인터페이스
    private int order;
    public RunnableExample(int order) { this.order = order; }

    @Override
    public void run() {
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.order +  "번째 스레드 종료합니다.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i = 1; i <= 10 ; i++) {
            Thread thread = new Thread(new RunnableExample(i));   // Thread 상속 예제에서 여기만 변경됨.
            thread.start();
            threadList.add(thread);
        }

        for(int i = 0; i < threadList.size() ; i++) {
            Thread thread = threadList.get(i);
            try {
                thread.join();
            } catch (Exception e) {
            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}

