class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String s = "";
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'A'){
                s += "B";
            }
            if(c == 'B'){
                s += "A";
            }
        }
        if(s.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}