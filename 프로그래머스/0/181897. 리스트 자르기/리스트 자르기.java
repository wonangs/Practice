import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer;

        switch (n) {
            case 1:
                // 0번 인덱스부터 b번 인덱스까지
                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;
            case 2:
                // a번 인덱스부터 마지막 인덱스까지
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3:
                // a번 인덱스부터 b번 인덱스까지
                answer = Arrays.copyOfRange(num_list, a, b + 1);
                break;
            case 4:
                // a번 인덱스부터 b번 인덱스까지 c 간격으로
                answer = new int[(b - a) / c + 1];
                for (int i = 0, j = a; j <= b; i++, j += c) {
                    answer[i] = num_list[j];
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid value for n: " + n);
        }

        return answer;
    }
}