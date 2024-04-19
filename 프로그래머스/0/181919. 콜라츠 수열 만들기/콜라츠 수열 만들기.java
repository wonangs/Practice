import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answeral = new ArrayList<Integer>();
        
        while (n != 1) {
            answeral.add(n);
        
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        answeral.add(1);
                
        int[] answer = new int[answeral.size()];
        for (int i = 0; i < answeral.size(); i++)
            answer[i] = answeral.get(i);
        
        return answer;
    }
}