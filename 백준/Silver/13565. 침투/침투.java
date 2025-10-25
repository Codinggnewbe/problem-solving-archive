// 방문하고자 하는 곳을 1로 사용하자. 즉 문제와 반대로
import java.util.*;
import java.io.*;

public class Main {
    final static int MAX = 1000 + 10;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    static int T, N, M, K;
    static boolean answer;

    public static void dfs(int y, int x){
        if(y == N){
            answer = true;
            return;
        }
        visited[y][x] = true;
        for(int i = 0; i <4; i++){
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(map[newY][newX] && visited[newY][newX] == false){
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];
        
        // map
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            for(int j = 1; j <= M; j++){
                map[i][j] = (str.charAt(j - 1) == '0' ? true : false); // 0과 1을 바꿔주기 위해
            }
        }
        
        // dfs
        for(int j = 1; j <= M; j++){
            if(map[1][j])
                dfs(1,j);
        }
        
        // 출력
        if(answer) bw.write("YES");
        else bw.write("NO");

        bw.close(); br.close();
    }
}