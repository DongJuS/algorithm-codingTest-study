import java.util.*;

public class 주식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < tc; i++) {
            int day = Integer.parseInt(sc.nextLine());
            int[] arr = new int[day];
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < day; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long profit = 0;
            int max = 0;

            // 뒤에서부터 주가를 훑으면서 현재까지의 최대값을 저장
            for (int j = day - 1; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                } else {
                    profit += max - arr[j];
                }
            }

            System.out.println(profit);
        }
    }
}
