import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] basket = new int[N + 1]; // 바구니 초기화

        // 처음에는 바구니 번호 순서대로 초기화
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            // start부터 end까지의 범위를 역순으로 바꿈
            reverse(basket, start, end);
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }
        scanner.close();
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