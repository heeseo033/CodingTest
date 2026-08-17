class Solution {
    public int[] solution(int n, int k) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                count++;
            }
        }
        int[] answer = new int[count];
        int num = 0;
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                answer[num] = i;
                num++;
            }
        }
        return answer;
    }
}