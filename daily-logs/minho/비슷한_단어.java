import java.util.*;
public class 비슷한_단어{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[26];
        int[] tmp = new int[26];
        String s = sc.nextLine();
        int rst = 0;

        for(int i=0; i<s.length(); i++){
            arr[(int)(s.charAt(i) - 'A')]++;
        }

        for(int i=0; i<N-1; i++){
            String str = sc.nextLine();
            int diff = 0;
            for(int j=0; j<str.length(); j++){
                tmp[(int)(str.charAt(j)) -'A']++;
            }
            for(int j=0; j<26; j++){
                if(arr[j] != tmp[j]){
                    diff += Math.abs(tmp[j] - arr[j]);
                }
            }

            if(str.length() == s.length()){
                if(diff <=2) rst++;
            }else{
                if(diff <=1) rst++;
            }

            Arrays.fill(tmp, 0);
        }

        System.out.println(rst);
    }
}