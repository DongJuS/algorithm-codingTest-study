import java.util.*;

public class 수_이어_쓰기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = 0, num = 0;
        while (idx < s.length()) {
            num++;
            String tmp = String.valueOf(num);
            for (int i = 0; i < tmp.length() && idx < s.length(); i++) {
                if (tmp.charAt(i) == s.charAt(idx))
                    idx++;
            }
        }
        System.out.println(num);
    }
}