import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 3 + 100 + 10;
    static int[][] map;
    static boolean[][] visited;
    static int[] dirY = {1, 0};
    static int[] dirX = {0, 1};
    static int N;

    public static void dfs(int y, int x){
        visited[y][x] = true;

        if(y == N && x == N) return;

        for(int i = 0; i < 2; i++){
            int newY = y + dirY[i] * map[y][x];
            int newX = x + dirX[i] * map[y][x];
            if(visited[newY][newX] == false){
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];

        // map
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // dfs
        dfs(1, 1);

        // 출력
        if(visited[N][N]) bw.write("HaruHaru");
        else bw.write("Hing");

        br.close(); bw.close();
    }
}