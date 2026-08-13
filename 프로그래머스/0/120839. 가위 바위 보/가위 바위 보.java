class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            char c = rsp.charAt(i);
            if(c == '2'){
                answer += (c - 2 - '0');
            }
            else if(c == '0'){
                answer += (c + 5 - '0');
            }
            else {
                answer += (c - 3 - '0');
            }
        }
        return answer;
    }
}