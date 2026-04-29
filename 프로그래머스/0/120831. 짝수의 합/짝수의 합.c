#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int solution(int n) {
    int answer = 0;
    for(int num = 1; num <= n; num++)
        if(num % 2 == 0)
            answer += num;
    return answer;
}