import java.util.*;

public class 햄버거_분배 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String s = sc.nextLine();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'P')
                arr[i] = 1;
        }

        int rst = 0;
        for (int i = 0; i < N; i++) {
            boolean flag = false;
            if (arr[i] == 1) {
                for (int k = i - K; k < i; k++) {
                    if (k >= 0 && arr[k] == 0) {
                        arr[k] = 2;
                        rst++;
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    for (int k = i + 1; k <= i + K; k++) {
                        if (k < N && arr[k] == 0) {
                            arr[k] = 2;
                            rst++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(rst);
    }
}
