import java.util.StringTokenizer;
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer stk = new StringTokenizer(my_string, " ");
        String[] answer = new String[stk.countTokens()];
        int num = 0;
        while(stk.hasMoreTokens()){
            answer[num] = stk.nextToken();
            num++;
        }
        return answer;
    }
}