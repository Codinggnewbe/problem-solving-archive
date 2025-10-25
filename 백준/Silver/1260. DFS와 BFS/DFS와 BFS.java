import java.util.*;
import java.io.*;

public class Main {
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static ArrayList<Integer> queue;
    static int N, M, V;

    public static void dfs(int idx){
        visited[idx] = true;
        System.out.print(idx + " ");
        for(int i = 1; i <= N; i++){
            if(visited[i] == false && graph[idx][i])
                dfs(i);
        }
    }

    public static void bfs(){
        queue = new ArrayList<>();
        visited = new boolean[MAX]; // dfs에서 이미 사용해서 새로 만들어주는 것임

        queue.add(V); // 예시로, 1이 처음에 들어왔으니 1을 추가
        visited[V] = true;

        while(!queue.isEmpty()){
            int idx = queue.remove(0); // 맨 처음의 값을 제거를 하고, idx에 담겠다는 뜻
            System.out.print(idx + " ");

            for(int i = 1; i <= N; i++){
                if(visited[i] == false && graph[idx][i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // graph
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true; graph[y][x] = true;
        }

        // dfs
        dfs(V);
        System.out.println();

        // bfs
        bfs();
    }
}