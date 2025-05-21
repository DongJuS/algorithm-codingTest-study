import java.util.*;
public class 카드_2{
    public static void main(String[] args) {
        Deque<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);        
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= N; i++){
            list.add(i);
        }

        while(list.size() > 1){
            list.remove(0);
            list.add(list.remove());
        }

        System.out.println(list.getFirst());
    }
}