import java.util.Scanner;

class Main {

    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}