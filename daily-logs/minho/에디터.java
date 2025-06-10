import java.util.*;
import java.io.*;

public class 에디터 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        StringTokenizer st;

        for (int i = 0; i < s.length(); i++) {
            left.add(s.charAt(i));
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            if (c == 'L') {
                if (!left.isEmpty())
                    right.add(left.pop());
            } else if (c == 'D') {
                if (!right.isEmpty())
                    left.add(right.pop());
            } else if (c == 'B') {
                if (!left.isEmpty())
                    left.pop();
            } else {
                left.add(st.nextToken().charAt(0));
            }
        }

        int lsSize = left.size();
        int rsSize = right.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lsSize; i++) {
            sb.append(left.pop());
        }
        sb.reverse();
        for (int i = 0; i < rsSize; i++) {
            sb.append(right.pop());
        }

        System.out.println(sb.toString());
    }
}
