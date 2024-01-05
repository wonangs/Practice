import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
//            sb.append("Case #").append(i + 1 + ": ").append(a).append(" + ").append(b + " = ").append(a + b + "\n");
            sb.append("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }

        System.out.println(sb);
    }
}