class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if((c + "").equals(alp)){
                answer += (char)(c - 32);
            }
            else{
                answer += c;
            }
        }
        return answer;
    }
}