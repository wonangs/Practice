import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c3 = a * (b % 10);
        int c4 = a * ((b % 100) / 10);
        int c5 = a * (b / 100);
        int c6 = c3 + (c4 * 10) + (c5 * 100);

        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}