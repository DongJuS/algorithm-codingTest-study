import java.util.*;
class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class 덩치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringTokenizer st;
        ArrayList<Pair> al = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(sc.nextLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Pair p = new Pair(x, y);
            al.add(p);
        }

        for(int i=0; i<N; i++){
            Pair curr = al.get(i);
            int rank = 1;
            for(int j=0; j<N; j++){
                if(i==j) continue;
                Pair tmp = al.get(j);
                if(curr.x < tmp.x && curr.y < tmp.y) rank++;
            }
            System.out.print(rank + " ");
        }
    }
}