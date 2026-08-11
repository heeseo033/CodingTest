def solution(num_list):
    
    a = 0;
    b = 0;
    for num_list in num_list:
        if(num_list % 2 == 0):
            a += 1
        else:
            b += 1
    answer = [a, b]
    return answer