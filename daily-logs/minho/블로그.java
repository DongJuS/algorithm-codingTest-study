import java.util.*;

public class 블로그 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(sc.nextLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int p = 0, q = X - 1;
        int max = 0, curr = 0, cnt = 0;
        for (int i = p; i <= q; i++) {
            curr += arr[i];
        }
        max = curr;
        cnt++;

        while (q < N - 1) {
            curr -= arr[p];
            p++;
            q++;
            curr += arr[q];
            if (curr == max)
                cnt++;
            else if (curr > max) {
                max = curr;
                cnt = 1;
            }
        }
        if (max == 0)
            System.out.println("SAD");
        else {
            System.out.println(max);
            System.out.println(cnt);
        }

    }
}