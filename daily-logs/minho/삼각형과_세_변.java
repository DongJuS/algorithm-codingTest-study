import java.io.*;
import java.util.*;
public class 삼각형과_세_변 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr = new int[3];

        while(true){
            st = new StringTokenizer(br.readLine());

            for(int i=0; i<3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            Arrays.sort(arr);

            if(!(arr[0] + arr[1] > arr[2])){
                bw.write("Invalid\n");
            }
            else if(arr[0] == arr[1] && arr[1] == arr[2]){
                bw.write("Equilateral\n");
            }
            else if(arr[0] == arr[1] || arr[1] == arr[2]){
                bw.write("Isosceles\n");
            }
            else{
                bw.write("Scalene\n");
            }
        }
        bw.flush();
    }
}