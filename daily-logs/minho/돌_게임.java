import java.util.*;

public class 돌_게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        boolean[] arr = new boolean[1003];
        arr[1] = true; // 상근
        arr[3] = true;

        for (int i = 1; i < N; i++) {
            arr[i + 1] = !arr[i];
            arr[i + 3] = !arr[i];
        }

        if (arr[N])
            System.out.println("SK");
        else
            System.out.println("CY");

    }
}