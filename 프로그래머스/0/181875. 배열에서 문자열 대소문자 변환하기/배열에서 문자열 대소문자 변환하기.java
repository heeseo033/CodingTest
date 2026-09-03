class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            answer[i] = "";
            for(int j = 0; j < strArr[i].length(); j++){
                
                if((i + 1) % 2 != 0){
                    char c = strArr[i].charAt(j);
                    if(c >= 'A' && c <= 'Z'){
                        answer[i] += (char)(c + 32);
                    }
                    else{
                        answer[i] += c;
                    }
                }
                else{
                    char c = strArr[i].charAt(j);
                    if(c >= 'a' && c <= 'z'){
                        answer[i] += (char)(c - 32);
                    }
                    else{
                        answer[i] += c;
                    }
                    
                }
            }
        }
        return answer;
    }
}