import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        while (true) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 & b == 0)
                break;

            sb.append(a + b + "\n");

        }
        System.out.println(sb);
    }
}