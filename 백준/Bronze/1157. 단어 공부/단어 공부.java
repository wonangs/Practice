import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] cntAr = new int[26]; // 소문자 알파벳 개수만큼 배열 크기 설정

        // 각 알파벳의 빈도수 계산
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                cntAr[Character.toUpperCase(c) - 'A']++;
            }
        }

        int maxCount = 0;
        int maxIndex = -1;
        boolean multipleMax = false;

        // 가장 많이 사용된 알파벳 찾기
        for (int i = 0; i < cntAr.length; i++) {
            if (cntAr[i] > maxCount) {
                maxCount = cntAr[i];
                maxIndex = i;
                multipleMax = false;
            } else if (cntAr[i] == maxCount && maxCount != 0) {
                multipleMax = true;
            }
        }

        // 결과 출력
        if (multipleMax) {
            System.out.println("?");
        } else if (maxIndex == -1) {
            System.out.println("입력이 없습니다.");
        } else {
            System.out.println((char) (maxIndex + 'A'));
        }
    }
}