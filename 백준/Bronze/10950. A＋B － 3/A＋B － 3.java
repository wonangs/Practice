import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            sb.append(b + c).append("\n");
        }
        System.out.print(sb);
    }
}