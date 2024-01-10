import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        String str;

        while ((str = br.readLine()) != null) { // 빈값이 아닐 때까지 실행한다


            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append(a + b + "\n");

        }
        System.out.print(sb);
    }
}