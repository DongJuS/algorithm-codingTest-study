import java.util.*;
public class 주유소{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] dist = new int[N-1];
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for(int i=0; i<N-1; i++){
            dist[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(sc.nextLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cost = Integer.MAX_VALUE;  
        Long rst = 0;
        for(int i=0; i<N-1; i++){
            cost = Math.min(cost, arr[i]);
            rst += 1L * cost * dist[i]; 
        }

        System.out.println(rst);
        
    }
}