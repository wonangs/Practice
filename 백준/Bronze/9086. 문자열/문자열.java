import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            al.add(sc.nextLine());
        }

        for (int j = 0; j < T; j++) {
            String als = al.get(j);

            if (als.length() >= 1) {
                String answer = (als.length() == 1) ? als + als : als.substring(0, 1) + als.substring(als.length() - 1);
                System.out.println(answer);

            }
        }
    }
}