import java.util.*;

class DoublePair {
    int init_lv;
    ArrayList<Pair> list;
    boolean started;
    public DoublePair(int init_lv, ArrayList<Pair> list) {
        this.init_lv = init_lv;
        this.list = list;
        this.started = false;
    }
}

class Pair {
    int lv;
    String nick;

    Pair(int lv, String nick) {
        this.lv = lv;
        this.nick = nick;
    }
}

public class 랭킹전_대기열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int p = Integer.parseInt(st.nextToken()); // 플레이어 수
        int m = Integer.parseInt(st.nextToken()); // 방의 정원

        ArrayList<DoublePair> doublePairs = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(sc.nextLine());
            int lv = Integer.parseInt(st.nextToken());
            String nick = st.nextToken();

            boolean flag = false;
            int idx = 0;
            for (int j = 0; j < doublePairs.size(); j++) {
                DoublePair dp = doublePairs.get(j);
                if (!dp.started && dp.init_lv - 10 <= lv && lv <= dp.init_lv + 10) {
                    flag = true;
                    idx = j;
                    break;
                }
            }

            if (flag) {
                DoublePair target = doublePairs.get(idx);
                target.list.add(new Pair(lv, nick));

                if (target.list.size() == m) {
                    target.started = true;
                }
            } else {
                ArrayList<Pair> list = new ArrayList<>();
                list.add(new Pair(lv, nick));
                doublePairs.add(new DoublePair(lv, list));

                if (list.size() == m) {
                    doublePairs.get(doublePairs.size() - 1).started = true;
                }
            }
        }

        for (DoublePair dp : doublePairs) {
            Collections.sort(dp.list, (a, b) -> a.nick.compareTo(b.nick));

            if (dp.started) {
                System.out.println("Started!");
            } else {
                System.out.println("Waiting!");
            }

            for (Pair p2 : dp.list) {
                System.out.println(p2.lv + " " + p2.nick);
            }
        }
    }
}
