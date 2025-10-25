import java.util.*;
import java.io.*;

public class Main {
    final static int MAX = 100 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, start, end, answer;

    public static void dfs(int idx, int count){
        visited[idx] = true;

        if(idx == end){
            answer = count;
            return;
        }

        for(int i = 1; i <= N; i++){
            if(visited[i] == false && graph[idx][i])
                dfs(i, count + 1);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        // graph
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer = -1;

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true; graph[y][x] = true;
        }

        // dfs
        dfs(start, 0); // 0은 촌수를 계산하는 숫자, 나 자신은 0촌이니 0으로 시작임

        // 출력
        bw.write(String.valueOf(answer));

        br.close(); bw.close();
    }

}