import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (b + c >= 60) {
            if (a + ((b + c) / 60) >= 24) {
                System.out.println(a + ((b + c) / 60) - 24 + " " + ((b + c) % 60));
            } else {
                System.out.println((a + ((b + c) / 60)) + " " + ((b + c) % 60));
            }
        } else {
            System.out.println((a + ((b + c) / 60)) + " " + (b + c) % 60);
        }
    }
}

