import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            al.add(sc.nextInt());
        }
        int aMax = Integer.MIN_VALUE;
        int aMin = Integer.MAX_VALUE;

        for (int a : al) {
            aMax = Math.max(aMax, a);
            aMin = Math.min(aMin, a);
        }
        System.out.printf("%d %d", aMin, aMax);
    }
}