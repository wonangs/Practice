import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pieces = new int[6];
        int[] defaultpieces = {1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < 6; i++) {
            pieces[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(defaultpieces[i] - pieces[i] + " ");
        }
    }
}