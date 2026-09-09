class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int maxX = (int)(board[0] / 2);
        int minX = -(int)(board[0] / 2);
        int maxY = (int)(board[1] / 2);
        int minY = -(int)(board[1] / 2);
        
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left") && answer[0] > minX){
                answer[0] -= 1;
            }
            else if(keyinput[i].equals("right") && answer[0] < maxX){
                answer[0] += 1;
            }
            if(keyinput[i].equals("up") && answer[1] < maxY ){
                answer[1] += 1;
            }
            else if(keyinput[i].equals("down") && answer[1] > minY){
                answer[1] -= 1;
            }
        }
        
        return answer;
    }
}