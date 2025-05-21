import java.io.*;
import java.util.*;
public class 어두운_굴다리{

    static int N, M; 
    static int[] Arr;

    static boolean foo(int height){
        int prev = 0;
        for(int i=0; i< Arr.length; i++){
            if(Arr[i] - height > prev) return false;
            else prev = Arr[i] + height;
        }
        return prev >= N;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Arr = new int[M];
        for(int i=0; i<M; i++) {
            Arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 1;
        int right = N; 
        int rst = 0;

        while(left <= right){
            int mid = (left+right) /2;
            if(foo(mid)){
                rst = mid;
                right = mid -1;
            }else left = mid +1;
        }
        System.out.println(rst);
    }
}