import java.util.*;
import java.io.*;
public class 쿠키의_신체_측정 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] arr =new char[N][N];
        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j] = s.charAt(j);
            }
        }

        int heart_x = 0, heart_y = 0;

        for(int i=1; i<N-1; i++){
            for(int j=1; j<N-1; j++){
                if(arr[i-1][j] == '*' &&arr[i+1][j] == '*' &&arr[i][j-1] == '*' &&arr[i][j+1] == '*' ){
                    heart_x = j;
                    heart_y = i;
                    break;
                }
            }
        }
        System.out.println((heart_y+1) + " " + (heart_x+1));

        int back_y=0;
        int leftArm = 0, rightArm =0, back=0, leftLeg=0, rightLeg=0;
        for(int i= heart_x-1; i>= 0; i--){
            if(arr[heart_y][i] == '*') leftArm++;
        }
        for(int i= heart_x+1; i<N; i++){
            if(arr[heart_y][i] == '*') rightArm++;
        }
        for(int i= heart_y+1; i<N; i++){
            if(arr[i][heart_x] == '*') back++;
            else{
                back_y= i-1;
                break;
            }
        }
        for(int i= back_y+1; i<N; i++){ 
            if(arr[i][heart_x-1] == '*') leftLeg++;
        }
         for(int i= back_y+1; i<N; i++){
            if(arr[i][heart_x+1] == '*') rightLeg++;
        }
        System.out.println(leftArm+" "+rightArm+" "+back+" "+leftLeg+" "+rightLeg+" ");
    }
}