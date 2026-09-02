class Solution {
    public String solution(int age) {
        String answer = "";
        String a = age + "";
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            answer += (char)(c + '1');
        }
        return answer;
    }
}