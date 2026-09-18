def solution(n):
    answer = 2
    for a in range(1, n):
        if(a * a == n):
            answer = 1
        
    return answer