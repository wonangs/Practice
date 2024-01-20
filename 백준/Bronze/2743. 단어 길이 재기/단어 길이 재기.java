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
        String[] ar = new String[100];

        String S = sc.nextLine();
        sb.append(S);

        System.out.println(sb.length());
    }
}