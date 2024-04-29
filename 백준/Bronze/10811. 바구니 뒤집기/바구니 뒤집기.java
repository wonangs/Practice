import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N과 M을 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 바구니 배열 생성 및 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // M번의 바구니 순서 역순 변환
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1; // 0부터 시작하도록 인덱스 조정
            int end = Integer.parseInt(st.nextToken()) - 1; // 0부터 시작하도록 인덱스 조정
            reverseBaskets(baskets, start, end);
        }

        // 바구니에 적힌 순서 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(baskets[i]).append(" ");
        }
        System.out.println(sb);
    }

    // 배열의 일부를 역순으로 만드는 메소드
    private static void reverseBaskets(int[] baskets, int start, int end) {
        while (start < end) {
            int temp = baskets[start];
            baskets[start] = baskets[end];
            baskets[end] = temp;
            start++;
            end--;
        }
    }
}