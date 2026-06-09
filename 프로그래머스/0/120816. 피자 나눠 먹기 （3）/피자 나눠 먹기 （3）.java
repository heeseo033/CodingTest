class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int a = n / slice;
        if(n % slice == 0){
            answer = a;
        }
        else{
            answer = a + 1;
        }
        return answer;
    }
}