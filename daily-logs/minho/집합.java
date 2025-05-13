import java.util.*;
import java.io.*;

public class 집합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int num = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String o = st.nextToken();
            if (o.equals("add")) {
                int t = Integer.parseInt(st.nextToken());
                num |= (1 << (t - 1));
            } else if (o.equals("remove")) {
                int t = Integer.parseInt(st.nextToken());
                num &= ~(1 << (t - 1));
            } else if (o.equals("check")) {
                int t = Integer.parseInt(st.nextToken());
                if ((num & (1 << (t - 1))) == 0)
                    bw.write("0\n");
                else
                    bw.write("1\n");
            } else if (o.equals("toggle")) {
                int t = Integer.parseInt(st.nextToken());
                num ^= (1 << (t - 1));
            } else if (o.equals("all")) {
                num = Integer.MAX_VALUE;
            } else {
                num = 0;
            }
        }
        bw.flush();
    }
}