import java.io.*;
import java.util.*;
public class 영단어_암기는_괴로워{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=  new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(int i=0; i<N; i++){
            String s = br.readLine();
            if(s.length() < M) continue; 

            hashMap.merge(s, 1, Integer::sum);
        }

        ArrayList<String> al = new ArrayList<>(hashMap.keySet());
        Collections.sort(al, (a,b) -> {
            if(hashMap.get(a) != hashMap.get(b)) return hashMap.get(b) - hashMap.get(a);  
            if(a.length() != b.length()) return b.length() - a.length();
            return a.compareTo(b);
        });

        
        for(int i=0; i< al.size(); i++){
            bw.write(al.get(i) + "\n");
        }
        bw.flush();
    }
}