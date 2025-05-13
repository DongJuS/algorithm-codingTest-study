import java.util.*;
import java.io.*;
class Pair {
int idx;
int g;
int s;
int b;
public Pair(int idx, int g, int s, int b){
    this.idx = idx;
    this.g = g;
    this.s = s;
    this.b = b;
}
}
public class 올림픽 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Pair> al = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Pair p = new Pair(idx, g, s, b);
            al.add(p);
        }

        Collections.sort(al, (a,b) -> {
            if(a.g != b.g) return b.g - a.g;
            if(a.s != b.s) return b.s - a.s;
            return b.b - a.b;
        });

        int rank = 1;
        int rst = 0;

        for (int i=0; i<al.size(); i++) {
            Pair p = al.get(i);
            if (i > 0) {
                Pair prev = al.get(i-1);
                if (!(p.g == prev.g && p.s == prev.s && p.b == prev.b)) {
                    rank = i + 1;
                }
            }
            if (p.idx == K) {
                rst = rank;
                break;
            }
        }
        System.out.println(rst);
    }
}