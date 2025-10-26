import java.util.*;
import java.io.*;
public class Main {
    static final int MAX = 25+ 10;
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int total; // dfs 시작한 횟수
    static ArrayList<Integer> count;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    static int num;
    public static void dfs(int y, int x){
        visited[y][x] = true;
        num++;
        
        for(int i = 0; i < 4; i++){
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(!visited[newY][newX] && map[newY][newX] == 1) dfs(newY, newX);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N  = Integer.parseInt(br.readLine());

        // map
        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            for(int j = 1; j <= N; j++){
                map[i][j] = Integer.parseInt(String.valueOf(str.charAt(j - 1)));
            }
        }

        // dfs
        total = 0;
        count = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    num = 0;
                    dfs(i, j);
                    total++;
                    count.add(num);
                }
            }
        }

        // 아파트 수 정렬
        Collections.sort(count);

        // 출력
        bw.write(String.valueOf(total));
        bw.newLine();
        for(int i = 0; i < count.size(); i++){
            bw.write(String.valueOf(count.get(i)));
            bw.newLine();
        }

        br.close(); bw.close();
    }
}