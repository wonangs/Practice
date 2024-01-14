import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] ar = new int[N];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();

            if (max < ar[i]) {
                max = ar[i];
            }

            if (min > ar[i]) {
                min = ar[i];
            }
        }
        sc.nextLine();
        System.out.printf("%d %d", min, max);
    }
}