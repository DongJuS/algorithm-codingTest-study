import java.io.*;
import java.util.*;
public class 스위치_켜고_끄기{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());
        int[] arr = new int[s];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<s; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int gen = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(gen == 1){
                for(int j=num-1; j < s; j += num){
                    arr[j] ^= 1;
                }
            }else{
                arr[num-1] ^= 1;
                int l_idx = num-2;
                int r_idx = num;
                while(true){
                    if(l_idx >= 0 && r_idx < s){
                        if(arr[l_idx] == arr[r_idx]){
                            arr[l_idx] ^= 1;
                            arr[r_idx] ^= 1;
                            l_idx--;
                            r_idx++;
                        }else{
                            break;
                        }
                    }else break;
                }
            }
        }

        for(int i=0; i<s; i++){
            bw.write(arr[i] + " ");
            if((i+1) % 20 == 0) bw.write("\n");
        }
        bw.flush();
    }
}