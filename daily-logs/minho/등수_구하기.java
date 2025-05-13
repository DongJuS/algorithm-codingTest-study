import java.util.*;
public class 등수_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken()); // 리스트 개수 
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken()); // 크기 제한
        int rst =1;
        if(N>0){
            st = new StringTokenizer(sc.nextLine());
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<N; i++){
                list.add(Integer.parseInt(st.nextToken()));      
            }

            if(list.get(0) < score) rst = 1;
            else if(list.get(N-1) >= score && N == P) rst = -1;
            else{
                list.add(score);
                Collections.sort(list, (a,b) -> {return b-a;});
            
                rst = 1;
                for(int i=0; i<N+1; i++){
                    int curr = list.get(i);
                    if(i!= 0){
                        int prev = list.get(i-1);
                        if(prev != curr) rst = i+1;
                    }
                    if(curr == score) break;
                }
            }
       
        }
         System.out.println(rst);
            
    } 
} 
        