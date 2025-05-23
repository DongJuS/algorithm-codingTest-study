
import java.io.*;
import java.util.*;
public class 가희와_키워드{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        for(int i=0; i<N; i++){
            hashSet.add(br.readLine());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), ",");
            while(st.hasMoreTokens()){
                hashSet.remove(st.nextToken());
            }
            bw.write(hashSet.size()+"\n");
        }
        bw.flush();
    }
}