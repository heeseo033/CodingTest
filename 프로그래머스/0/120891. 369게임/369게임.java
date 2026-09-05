class Solution {
    public int solution(int order) {
        int answer = 0;
        String or = order + "";
        for(int i = 0; i < or.length(); i++){
            char c = or.charAt(i);
            if(c == '3' || c == '6' || c == '9'){
                answer++;
            }
        }
        return answer;
    }
}