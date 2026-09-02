class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String n = num + "";
        for(int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            if((c - '0') == k){
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}