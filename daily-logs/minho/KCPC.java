import java.io.*;
import java.util.*;

public class KCPC {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc = 0; tc<T; tc++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //팀 개수
            int k = Integer.parseInt(st.nextToken()); //문제의 개수
            int t = Integer.parseInt(st.nextToken())-1;//팀 ID
            int m = Integer.parseInt(st.nextToken()); //로그엔트리

            int[][] score_arr_tmp = new int[n][k]; // 점수
            int[] cnt_arr = new int[n]; // 시도횟수
            int[] time_arr = new int[n]; // 시간
            int[] score_arr = new int[n]; // 점수
            for(int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());
                int t_id = Integer.parseInt(st.nextToken()) -1;
                int p_id = Integer.parseInt(st.nextToken()) -1;
                int score = Integer.parseInt(st.nextToken());

                score_arr_tmp[t_id][p_id] = Math.max(score_arr_tmp[t_id][p_id],score);
                cnt_arr[t_id]++;
                time_arr[t_id] = Math.max(time_arr[t_id], i);
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<k; j++){
                    score_arr[i] += score_arr_tmp[i][j];
                }
            }

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(i);
            }

            Collections.sort(list, (a,b) -> {
                if(score_arr[a] != score_arr[b]) return score_arr[b] - score_arr[a];
                if(cnt_arr[a] != cnt_arr[b]) return cnt_arr[a] - cnt_arr[b];
                return time_arr[a] - time_arr[b];
            });

            int rst = 0;
            for(int i=0; i<n; i++){
                if(list.get(i) == t){
                    rst = i+1;
                    break;
                }
            }
            bw.write(rst+"\n");
        }
        bw.flush();
    }
    
}