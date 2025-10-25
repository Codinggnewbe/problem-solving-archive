import java.util.*;
import java.io.*;

public class Main {
    final static int MAX = 50 + 10;
    static boolean[][] map;
    static boolean[][] visited;
    static int T, N, M, K;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    public static void dfs(int y, int x){
        visited[y][x] = true;
        for(int i = 0; i < 4; i++){ // 4인 이유는 dirY, dirX의 갯수가 4개다
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(map[newY][newX] && visited[newY][newX] == false)
                dfs(newY, newX);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[MAX][MAX];
            visited = new boolean[MAX][MAX];

            // map 정보 반영 / 문제는 0,0부터 시작하지만 편하게 고려하기 위해  배추 위치에 1을 더함
            for(int i = 0; i < K; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y + 1][x + 1] = true; // 1을 더한 상태에서 하게 되면 dfs 함수에서 조건문을 돌때 값의 범위를 고려X, 항상 존재하고, 항상 false니까
            }

            // dfs
            int answer = 0;
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= M; j++){
                    if(map[i][j] && visited[i][j] == false){
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            // 출력
            bw.write(String.valueOf(answer));
            bw.newLine();
        }
        br.close(); bw.close();
    }
}