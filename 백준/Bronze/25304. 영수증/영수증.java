import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < b; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            sum += (price * count);
        }

        if (a == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}