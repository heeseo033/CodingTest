class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int sum = 0;
        while(tmp > 0){
            sum += tmp % 10;
            tmp /= 10;
        }
        if(x % sum == 0)
            answer = true;
        else
            answer = false;
        return answer;
    }
}