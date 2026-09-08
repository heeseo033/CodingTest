class Solution {
    public String[] solution(String my_string) {
        int count = 0;
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c == ' '){
                count++;
            }
        }
        String[] answer = new String[count + 1];
        int num = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = "";
        }
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c == ' '){
                num++;
            }
            else{
                answer[num] += c;
            }
        }
        return answer;
    }
}