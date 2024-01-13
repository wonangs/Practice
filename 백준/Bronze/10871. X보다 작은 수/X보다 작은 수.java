import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int cnt = 0;



        for (int i = 0; i < N; i++) {
            int answer = sc.nextInt();

            if (answer < X) {
                sb.append(answer).append(" ");
            }
        }
        System.out.println(sb);
    }
}