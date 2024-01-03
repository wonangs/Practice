import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a / 4; i++) {
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb);
    }
}