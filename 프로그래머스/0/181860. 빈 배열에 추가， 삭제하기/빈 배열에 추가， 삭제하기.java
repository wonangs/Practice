import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) { // flag 1이면 2배 추가
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) { // flag 2면 원소 제거
                    list.remove(list.size() - 1);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray(); // 리스트 to 배열
    }
}
