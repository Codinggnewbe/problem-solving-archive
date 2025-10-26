import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 100 + 10;
    static int[][] map;
    static boolean[][] visited;
    static int N, M, V;
    static int answer;
    static Queue<int[]> queue;
    static int[] dirY = {1, -1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    public static void bfs(int y, int x){
        queue = new LinkedList<>();
        queue.add(new int[]{y, x}); // 현재 좌표 넣기
        visited[y][x] = true;

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int curY = now[0]; // 큐에 있는 좌표값 중 첫번째(y좌표) 값을 꺼냄
            int curX = now[1]; // 두번째(x좌표) 값을 꺼냄

            if(curX == M && curY == N){ // 원하는 위치에 도착시
                answer = map[curY][curX];
                return;
            }

            for(int i = 0; i < 4; i++){
                int newY = curY + dirY[i];
                int newX = curX + dirX[i];

                if(newY < 1 || newY > N || newX < 1|| newX > M) continue;
                if(map[newY][newX] == 0 || visited[newY][newX]) continue; // 첫번째는 벽 충돌 여부

                visited[newY][newX] = true;
                map[newY][newX] = map[curY][curX] + 1; // 거리 누적
                queue.add(new int[] {newY, newX});
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 행
        M = Integer.parseInt(st.nextToken()); // 열

        // map
        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            for(int j = 1; j <= M; j++){
                map[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }

        // bfs
        answer = 0;
        bfs(1, 1);

        // 출력
        bw.write(String.valueOf(answer));

        br.close(); bw.close();
    }
}