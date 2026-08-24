import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 48 && c <= 57){
                count++;
            }
        }
        int[] answer = new int[count];
        int j = 0;
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 48 && c <= 57){
                answer[j] = c - '0';
                j++;
            }
        }    
        Arrays.sort(answer);
        return answer;
    }
}