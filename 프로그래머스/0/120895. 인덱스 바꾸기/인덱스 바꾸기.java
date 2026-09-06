class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char tmp = ' ';
        for(int i = 0; i < my_string.length(); i++){
            char a = my_string.charAt(num1);
            char b = my_string.charAt(num2);
            if(i == num1){
                answer += b;
            }
            else if(i == num2){
                answer += a;
            }
            else{
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}