import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();
//      ArrayList<Integer> al = new ArrayList<>();
        boolean[] ar = new boolean[42];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int idx = Integer.parseInt(br.readLine()) % 42;
            ar[idx] = true;
        }

        for (int i = 0; i < 42; i++) {
            if(ar[i])
                cnt++;
        }
        System.out.println(cnt);
    }
}