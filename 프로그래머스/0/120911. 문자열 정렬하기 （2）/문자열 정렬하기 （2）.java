import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] h = new char[my_string.length()];
        int j = 0;
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c <= 90){
                c += 32;
            }
            h[j] = c;
            j++;
        }
        Arrays.sort(h);
        String s = new String(h);
        answer = s;
        return answer;
    }
}