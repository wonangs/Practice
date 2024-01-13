import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            al.add(sc.nextInt());
        }

        int search = sc.nextInt();

        for (int als : al) {
            if (als == search)
                cnt++;
        }
        System.out.print(cnt);
    }
}