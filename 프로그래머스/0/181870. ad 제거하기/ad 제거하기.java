import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                ans.add(strArr[i]);
            }
        }
        String answer[] = new String[ans.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = ans.get(i);
        }
        
        
        return answer;
    }
}