import java.util.*;
import java.io.*;
public class 임스와_함께하는_미니게임 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char g = st.nextToken().charAt(0);
        
        HashSet<String> hs = new HashSet<>();
        for(int i=0; i<N; i++){
            hs.add(br.readLine());
        }

        int rst = 0;
        if(g=='Y'){
            rst+= hs.size();
        }else if(g=='F'){
            rst+= hs.size()/2;
        }else{
            rst+= hs.size()/3;
        }

        System.out.println(rst);
    }
}