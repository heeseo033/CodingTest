class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == 'p' || a == 'P')
                num1++;
            else if(a == 'y' || a == 'Y')
                num2++;
        }
        if(num1 == num2)
            answer = true;
        else
            answer = false;
        return answer;
    }
}