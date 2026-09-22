class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        if(str1.contains(str2)) answer = 1;
        
        /*for(int i = 0; i < str1.length(); i++){
            char c = str1.charAt(i);
            if(c == str2.charAt(0)){
                boolean b = true;
                for(int j = 0; j < str2.length(); j++){
                    char e = str1.charAt(i + j);
                    if(str2.charAt(j) != e){
                        b = false;
                        break;
                    }
                }
                if(b){
                    answer = 1;
                    break;
                }
                
            }
            if(answer == 1){
                break;
            }
        }*/
        
        return answer;
    }
}