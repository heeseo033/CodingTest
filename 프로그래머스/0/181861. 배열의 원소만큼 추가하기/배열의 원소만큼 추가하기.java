class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count += arr[i];
        }
        
        int[] answer = new int[count];
        
        int idx = 0;
       for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer[idx] = arr[i];
                idx++;
            }
        }    
        return answer;
    }
}