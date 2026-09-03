class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        int num = answer.length - 1;
        int a = num - 1;
        int b = num - 2;
        if(answer[a] > answer[b]) answer[num] = answer[a] - answer[b];
        else answer[num] = answer[a] * 2;
        return answer;
    }
}