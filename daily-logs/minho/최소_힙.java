import java.io.*;
import java.util.*;
public class 최소_힙{
    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(pq.isEmpty()){
                    bw.write("0\n");
                }else{
                bw.write(pq.poll()+"\n"); 
                }
            }else{
                pq.add(num);
                }            
        }
        bw.flush();
    }
}
