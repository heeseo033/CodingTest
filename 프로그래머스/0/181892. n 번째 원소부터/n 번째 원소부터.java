class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        for(int i = n - 1; i < num_list.length; i++){
            count++;
        }
        int[] answer = new int[count];
        for(int j = 0; j < answer.length; j++){
            answer[j] = num_list[n - 1];
            n++;
            
        }
        return answer;
    }
}