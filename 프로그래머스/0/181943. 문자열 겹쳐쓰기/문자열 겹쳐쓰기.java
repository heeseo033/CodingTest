class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i = 0; i < s; i++){
            char c = my_string.charAt(i);
            answer += c;
        }
        for(int i = 0; i < overwrite_string.length(); i++){
            char c = overwrite_string.charAt(i);
            answer += c;
        }
        for(int i = s + overwrite_string.length(); i < my_string.length(); i++){
            char c = my_string.charAt(i);
            answer += c;
        }
        return answer;
    }
}