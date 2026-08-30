class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        if(arr.length > 1){
            len = arr.length - 1;
        }
        else{
            len = 1;
        }
        int[] answer = new int[len];
        int Min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < Min){
                Min = arr[i];
            }
        }
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != Min){
                answer[a] = arr[i];
                a++;
            }
        }
        if(answer.length == 1){
            answer[0] = -1;
        }
        return answer;
    }
}