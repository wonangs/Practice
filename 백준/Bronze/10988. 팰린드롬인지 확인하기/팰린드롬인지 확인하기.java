import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pd = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < pd.length(); i++) {
            sb.append(pd.charAt(pd.length() - 1 - i));
        }

        if (pd.equalsIgnoreCase(sb.toString())) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}