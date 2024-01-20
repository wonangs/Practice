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
        String[] ar = new String[9999];
        
        String S = sc.nextLine();
        int answer = sc.nextInt();

        sb.append(S);

        for (int i = 0; i < sb.length(); i++) {
            if (i == answer - 1) {
                System.out.println(sb.charAt(i));
            }
        }
    }
}