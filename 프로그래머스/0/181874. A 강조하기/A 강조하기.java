class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'a'){
                answer += (char)(c - 32);
            }
            else{
                if(c >= 'B' && c <= 'Z'){
                    answer += (char)(c + 32);
                }
                else{
                    answer += c;
                }
            }
        }
        return answer;
    }
}