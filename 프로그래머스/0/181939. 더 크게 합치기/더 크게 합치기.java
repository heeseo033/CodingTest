class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmp1 = b;
        int multi1 = 1;
        do{
            multi1 *= 10;
            tmp1 /= 10;
        }while(tmp1 > 0);
        int num1 = (a * multi1) + b;
        
        int tmp2 = a;
        int multi2 = 1;
        do{
            multi2 *= 10;
            tmp2 /= 10;
        }while(tmp2 > 0);
        int num2 = (b * multi2) + a;
        if(num1 >= num2){
            answer = num1;
        }
        else{
            answer = num2;
        }
        return answer;
    }
}