class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                answer += c;
            }
            else{
                answer += (char)(c - 32);
            }
        }
        return answer;
    }
}