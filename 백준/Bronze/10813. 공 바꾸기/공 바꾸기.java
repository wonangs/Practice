import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N + 1]; // 바구니 초기화

        // 처음에는 바구니 번호와 같은 번호의 공이 들어있음
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // a번 바구니와 b번 바구니의 공을 교환
            int temp = basket[a];
            basket[a] = basket[b];
            basket[b] = temp;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}