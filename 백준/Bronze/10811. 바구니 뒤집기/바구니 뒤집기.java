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

        // 처음에는 바구니 번호 순서대로 초기화
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // start부터 end까지의 범위를 역순으로 바꿈
            reverse(basket, start, end);
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }
    }

    private static void reverse(int[] basket, int start, int end) {
        while (start < end) {
            int temp = basket[start];
            basket[start] = basket[end];
            basket[end] = temp;
            start++;
            end--;
        }
    }
}