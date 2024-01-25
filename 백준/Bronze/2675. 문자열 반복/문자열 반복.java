import javax.xml.stream.events.StartDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 입력받은 한줄을 공백을 기준으로 split 하여 배열에 넣는다
            String[] strar = br.readLine().split(" ");

            int R = Integer.parseInt(strar[0]);
            String S = strar[1];

            // 문자열의 길이만큼 반복
            for (int j = 0; j < S.length(); j++) {
                // 문자열의 길이를 R만큼 반복
                for (int k = 0; k < R; k++) {
                    // S문자열을 한글자씩 나누어서 출력
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}