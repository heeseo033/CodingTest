class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){
            for(int i = s.length() / 2 - 1; i < s.length() / 2 + 1; i++){
                char c = s.charAt(i);
                answer += c;
            }
        }
        else{
            int num = (int)(s.length() / 2);
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(i == num){
                    answer += c;
                }
            }
        }
        return answer;
    }
}