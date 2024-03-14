import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

//        String N = br.readLine();
//        String M = br.readLine();

//        int[] arr = new int[2];
//        int[] arr2 = new int[999];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        int answer2 = 0;

        int hundred = a / 100;
        int ten = a % 100 / 10;
        int one = a % 10;
        answer = (one * 100) + (ten * 10) + hundred;

        int hundred2 = b / 100;
        int ten2 = b % 100 / 10;
        int one2 = b % 10;
        answer2 = (one2 * 100) + (ten2 * 10) + hundred2;

        System.out.println(Math.max(answer, answer2));
    }
}