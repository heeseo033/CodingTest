class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length() - 4;
        for(int i = 0; i < len; i++){
            answer += "*";
        }
        for(int i = len; i < phone_number.length(); i++){
            char c = phone_number.charAt(i);
            answer += c;
        }
        return answer;
    }
}