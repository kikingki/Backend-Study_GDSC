package EOF;

import java.io.*;

public class BufferedReaderEOF {
    public static void main(String[] args) throws IOException {
        // BufferedReader & BufferedWriter - Scanner보다 속도가 훨씬 빠르다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        while((str = br.readLine()) != null) {
            bw.write(str+"\n");
        }
        bw.write("BufferedReader EOF");
        bw.flush();
        bw.close();
        br.close();
    }
}
