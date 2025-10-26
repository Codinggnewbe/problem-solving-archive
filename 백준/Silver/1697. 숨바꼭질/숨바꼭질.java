import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 100000 + 10;
    static int N, K;
    static int[] visited;
    static Queue<Integer> queue;
    static int count;

    public static void bfs(int start){
        queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1; // 0으로 하면 밑의 비교문에서 헷갈릴 가능성 있음

        while(!queue.isEmpty()){
            int now = queue.poll();

            if(now == K){
                return;
            }

            int[] next = {now - 1, now + 1, now * 2};

            for(int i = 0; i < 3; i++){
                int newP = next[i];
                if(newP >= 0 && newP < MAX && visited[newP] == 0){
                    visited[newP] = visited[now] + 1;
                    queue.add(newP);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        // map 필요없는듯
        visited = new int[MAX];

        // bfs

        bfs(N);

        // 출력
        bw.write(String.valueOf(visited[K] - 1));

        bw.close(); br.close();
    }
}