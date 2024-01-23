import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//      ArrayList<Integer> al = new ArrayList<>();
        int[] ar = new int[31];

        for (int i = 0; i < 28; i++) {
            int idx = Integer.parseInt(br.readLine());
            ar[idx] = 1;
        }

        for (int j = 1; j < 31; j++) {
            if (ar[j] != 1) {
                System.out.println(j);
            }
        }
    }
}