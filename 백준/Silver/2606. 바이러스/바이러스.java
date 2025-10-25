import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;
        answer++;

        for(int i = 0; i <= N; i++){
            if(visited[i] == false && graph[idx][i])
                dfs(i);
        }
    }

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        // graph에 연결 정보 채우기
        int x, y;
        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken()); // 띄어쓰기 기준 다음 것을 달라.
            y = Integer.parseInt(st.nextToken()); // x, y -> 1, 2 이렇게 들어갈 것임
            graph[x][y] = true;
            graph[y][x] = true;
        }
        
        // dfs(재귀함수) 호출
        dfs(1); // 1번부터 시작하겠다

        
        // 출력
        bw.write(String.valueOf(answer - 1));

        br.close(); bw.close();
    }
}