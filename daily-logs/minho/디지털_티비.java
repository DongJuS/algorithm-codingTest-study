import java.util.*;

public class 디지털_티비 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = new String[N];
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].equals("KBS1"))
                idx1 = i;
            else if (arr[i].equals("KBS2"))
                idx2 = i;
        }

        StringBuilder sb = new StringBuilder();
        if (idx1 > idx2) {
            for (int i = 0; i < idx1; i++) {
                sb.append("1");
            }
            for (int i = 0; i < idx1; i++) {
                sb.append("4");
            }
            for (int i = 0; i < idx2 + 1; i++) {
                sb.append("1");
            }
            for (int i = 0; i < idx2; i++) {
                sb.append("4");
            }
        } else {
            for (int i = 0; i < idx1; i++) {
                sb.append("1");
            }
            for (int i = 0; i < idx1; i++) {
                sb.append("4");
            }
            for (int i = 0; i < idx2; i++) {
                sb.append("1");
            }
            for (int i = 0; i < idx2 - 1; i++) {
                sb.append("4");
            }
        }

        System.out.println(sb.toString());

    }
}