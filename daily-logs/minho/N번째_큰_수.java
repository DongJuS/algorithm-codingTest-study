import java.util.*;

public class N번째_큰_수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < N; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        Collections.sort(list, (a, b) -> {
            return b - a;
        });
        System.out.println(list.get(N - 1));
    }
}