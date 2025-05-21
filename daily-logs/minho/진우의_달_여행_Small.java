import java.io.*;
import java.util.*;
public class 진우의_달_여행_Small{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][M];
        int[][][] dp = new int[N+1][M][3];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<M; j++){
                dp[0][j][i] = arr[0][j];
            }
        }

        for(int i=1; i<= N; i++){
            for(int j=0; j<M; j++){
                if(j-1>=0)
                    dp[i][j][0] = Math.min(dp[i-1][j][1]+ arr[i][j], dp[i-1][j-1][2] + arr[i][j]);  // 왼쪽 아래
                else
                    dp[i][j][0] = dp[i-1][j][1] + arr[i][j];


                if(j-1>=0 && j+1 < M)  
                    dp[i][j][1] = Math.min(dp[i-1][j-1][2]+ arr[i][j], dp[i-1][j+1][0] + arr[i][j]);  // 아래
                else if(j-1>=0 && j+1 >= M)
                    dp[i][j][1] = dp[i-1][j-1][2]+ arr[i][j];
                else 
                    dp[i][j][1] = dp[i-1][j+1][0]+ arr[i][j];
        

                if(j+1<M)
                    dp[i][j][2] = Math.min(dp[i-1][j+1][0]+ arr[i][j], dp[i-1][j][1] + arr[i][j]);  //오른쪽 아래
                else
                    dp[i][j][2] = dp[i-1][j][1] + arr[i][j];

            }
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<3; i++){
            for(int j=0; j<M; j++){
                min =Math.min(min, dp[N][j][i]);
            }
        }

        bw.write(min +"");
        bw.flush();
    }
}