class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        int[] count = new int[7];
        for (int num : dice) count[num]++;

        // 네 주사위가 모두 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                return 1111 * i;
            }
        }

        // 세 주사위가 같고 하나가 다른 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 3) {
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1) {
                        return (int) Math.pow(10 * i + j, 2);
                    }
                }
            }
        }

        // 두 주사위 쌍이 같은 경우
        int p = 0, q = 0;
        for (int i = 1; i <= 6; i++) {
            if (count[i] >= 2) {
                if (p == 0) {
                    p = i;
                } else {
                    q = i;
                    break;
                }
            }
        }
        if (p != 0 && q != 0) {
            return (p + q) * Math.abs(p - q);
        }

        // 두 주사위가 같고 나머지 두 주사위가 다른 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                int product = 1;
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1 && j != i) {
                        product *= j;
                    }
                }
                return product;
            }
        }

        // 모든 주사위가 다른 경우
        int min = 7;
        for (int num : dice) {
            min = Math.min(min, num);
        }
        return min;
    }
}