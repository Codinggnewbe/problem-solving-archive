import java.util.*;
import java.io.*;

public class Main {
    final static int MAX = 100000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean visited[];
    static int N, M, R;
    static int[] answer; // 방문 여부 기록
    static int order; // 순서 기록 1 -> 2 -> 3 등

    public static void dfs(int idx){
        visited[idx] = true;
        answer[idx] = order; // 몇 번째인지 알려주는
        order++;

        for(int i = 0; i < graph[idx].size(); i++){
            int next = graph[idx].get(i);
            if(visited[next] == false)
                dfs(next);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        // graph 연결 정보 채우기
        graph = new ArrayList[MAX];
        for(int i = 1; i <= N; i++){ // graph에 0~N까지 값을 채우는 과정
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1; // 순위

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y); graph[y].add(x);
        }

        // 오름차순 정렬
        for(int i = 1; i <= N; i++){
            Collections.sort(graph[i]);
        }

        // dfs(재귀함수)
        dfs(R);

        // 출력
        for(int i = 1; i <= N; i++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close(); bw.close();
    }
}