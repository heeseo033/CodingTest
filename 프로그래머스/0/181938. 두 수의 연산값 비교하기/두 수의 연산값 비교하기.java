class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = a + "" + b;
        int c = 2 * a * b;
        int d = Integer.parseInt(A);
        if(c >= d){
            answer = c;
        }
        else{
            answer = d;
        }
        return answer;
    }
}