import java.util.*;
import java.io.*;

public class 줄세우기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        for (int i = 1; i <= P; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int cnt = 0;
            ArrayList<Integer> al = new ArrayList<>();
            al.add(Integer.parseInt(st.nextToken()));
            for (int n = 0; n < 19; n++) {
                int curr = Integer.parseInt(st.nextToken());
                for (int num : al) {
                    if (num > curr)
                        cnt++;
                }
                al.add(curr);
            }
            System.out.println(i + " " + cnt);
        }
    }
}