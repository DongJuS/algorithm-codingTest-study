import java.io.*;
import java.util.*;

class Pair {
    String s;
    int power;
    public Pair(String s, int power) {
        this.s = s;
        this.power = power;
    }
}

public class IF문_좀_대신_써줘 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Pair> al = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int power = Integer.parseInt(st.nextToken());
            al.add(new Pair(s, power));
        }

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());

            int left = 0;
            int right = al.size() - 1;
            int idx = 0;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (num <= al.get(mid).power) {
                    idx = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            bw.write(al.get(idx).s + "\n");
        }

        bw.flush();
    }
}
