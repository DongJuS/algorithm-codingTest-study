import java.util.*;

public class 예산 {
    static int N, M;
    static int[] arr;

    static boolean foo(int target) {
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > target)
                tmp += target;
            else
                tmp += arr[i];
        }
        return tmp <= M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        arr = new int[N];
        M = Integer.parseInt(sc.nextLine());

        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        int rst = 0;
        int left = 1;
        int right = max;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (foo(mid)) {
                left = mid + 1;
                rst = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(rst);
    }
}