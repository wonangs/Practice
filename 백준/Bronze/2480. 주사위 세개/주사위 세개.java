import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int reward = 0;

        if (a == b && b == c) {
            reward = 10000 + (a * 1000);
            System.out.println(reward);
        } else if (a == b || b == c || c == a) {
            if (a == b) {
                reward = 1000 + (a * 100);
                System.out.println(reward);
            }
            if (b == c) {
                reward = 1000 + (b * 100);
                System.out.println(reward);
            }
            if (c == a) {
                reward = 1000 + (c * 100);
                System.out.println(reward);
            }
        } else {
            if (a > b && a > c) {
                reward = (a * 100);
                System.out.println(reward);
            }
            if (b > a && b > c) {
                reward = (b * 100);
                System.out.println(reward);
            }
            if (c > a && c > b) {
                reward = (c * 100);
                System.out.println(reward);
            }
        }
    }
}