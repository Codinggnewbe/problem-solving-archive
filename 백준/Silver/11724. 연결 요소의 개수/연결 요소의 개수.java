import java.util.*;
import java.io.*;

public class Main {
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static int N, M;
    static int answer;

    static void dfs(int idx){
        visited[idx] = true;
        for(int i = 0; i <= N; i++){
            if(visited[i] == false && graph[idx][i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer((br.readLine()));
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // graph 만들기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt((st.nextToken()));
            graph[u][v] = true;
            graph[v][u] = true;
        }

        // dfs(재귀함수)
        for(int i = 1; i <= N; i++){
            if(visited[i] == false){
                dfs(i);
                answer++;
            }
        }

        // 출력
        bw.write(String.valueOf(answer));

        br.close(); bw.close();
    }
}