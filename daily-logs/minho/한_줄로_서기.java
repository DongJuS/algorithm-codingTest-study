import java.util.*;

public class 한_줄로_서기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];
        Arrays.fill(arr, 11);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            for (int j = 0, idx = 0;;) {
                if (arr[j] != 11)
                    j++;
                else {
                    if (idx == num) {
                        arr[j] = i + 1;
                        break;
                    } else {
                        idx++;
                        j++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString());
    }
}