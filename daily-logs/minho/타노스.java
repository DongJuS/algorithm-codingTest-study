import java.util.*;
public class 타노스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[s.length()];
        int zero_cnt = 0, one_cnt = 0;
        
        for(int i=0; i<s.length(); i++){
            int tmp = Character.getNumericValue(s.charAt(i));
            if(tmp == 1) one_cnt++;
            else zero_cnt++; 
            arr[i] = tmp;
        }        

        for(int i=0, j=0; i<s.length() && j<one_cnt/2; i++){
            if(arr[i] == 1){
                arr[i] =2;
                j++;
            }
        }

        for(int i=s.length()-1, j=0; i>=0 && j<zero_cnt/2; i--){
            if(arr[i] == 0){
                arr[i] =2;
                j++;
            }
        }

        for(int i=0; i<s.length(); i++){
            if(arr[i] != 2){
                System.out.print(arr[i]);
            }
        }
    }
}