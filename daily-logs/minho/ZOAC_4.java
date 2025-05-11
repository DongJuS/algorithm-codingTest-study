import java.util.*;
public class ZOAC_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[4];
        s = sc.nextLine().split(" ");
        int H = Integer.parseInt(s[0]); // 세로 
        int W = Integer.parseInt(s[1]); // 가로
        int N = Integer.parseInt(s[2]); // 세로 여백
        int M = Integer.parseInt(s[3]); // 가로 여백

        int j = 1 + (W-1) / (1+M);
        int i = 1 + (H-1) / (1+N);
        
        int rst = i*j;
        System.out.println(rst);
    }
}