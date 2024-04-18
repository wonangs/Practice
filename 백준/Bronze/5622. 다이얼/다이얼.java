import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Integer> al = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        String[] ar = new String[100];


        String answer = br.readLine();
        int totalTime = 0; // 전체 시간을 저장할 변수

        for (int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            switch (ch) {
                case 'A':
                case 'B':
                case 'C':
                    totalTime += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    totalTime += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    totalTime += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    totalTime += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    totalTime += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    totalTime += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    totalTime += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    totalTime += 10;
                    break;
            }
        }

        System.out.println(totalTime);

    }
}