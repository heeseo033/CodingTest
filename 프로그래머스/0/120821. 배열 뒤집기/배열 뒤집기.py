def solution(num_list):
    answer = [] 
    num = len(num_list) - 1
    for a in range(0, len(num_list)):
        answer.append(num_list[num])
        num -= 1
    return answer