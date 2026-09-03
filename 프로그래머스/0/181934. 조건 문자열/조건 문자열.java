class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean b = false;
        if(ineq.equals("<") && eq.equals("=")){
            b = n <= m;
        }
        else if(ineq.equals("<") && eq.equals("!")){
            b = n < m ;
        }
        else if(ineq.equals(">") && eq.equals("=")){
            b = n >= m;
        }
        else{
            b = n > m;
        }
        if(b == true){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}