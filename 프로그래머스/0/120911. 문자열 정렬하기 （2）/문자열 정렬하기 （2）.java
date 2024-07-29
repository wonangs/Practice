import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lowerCaseString = my_string.toLowerCase();
        
        char[] charArray = lowerCaseString.toCharArray();
   
        Arrays.sort(charArray);
        
        return new String(charArray);
    }
}
