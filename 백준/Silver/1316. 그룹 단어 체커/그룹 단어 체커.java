import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        int prev = -1;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (visited[c - 'a'] && prev != c - 'a') {
                return false;
            }
            visited[c - 'a'] = true;
            prev = c - 'a';
        }

        return true;
    }
}