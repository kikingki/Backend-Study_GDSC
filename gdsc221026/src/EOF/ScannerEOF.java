package EOF;

import java.util.Scanner;

public class ScannerEOF {
    public static void main(String[] args) {
        // EOF == 더이상 읽어들일 수 있는 데이터 없음
        // EOF는 코테에서 무한 루프 탈출 조건으로 사용하는 경우 많음
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        System.out.println("Scanner EOF");
    }
}
