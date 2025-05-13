import java.util.*;

public class 단어_공부 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[Character.toLowerCase(s.charAt(i)) - 'a']++;
        }

        int max = 0, cnt = 0, idx = 0;
        boolean flag = true;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                cnt++;
                idx = i;
            }
        }

        if (cnt > 1)
            flag = false;

        if (flag) {
            System.out.println((char) Character.toUpperCase(idx + 'a'));
        } else {
            System.out.println("?");
        }
    }
}