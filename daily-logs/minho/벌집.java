import java.util.*;

public class 벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        N--;
        int rst = 1, d = 1;
        while (N > 0) {
            rst++;
            N -= 6 * d;
            d++;
        }

        System.out.println(rst);
    }

}