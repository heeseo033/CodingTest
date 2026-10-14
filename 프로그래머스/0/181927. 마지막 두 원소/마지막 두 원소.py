def solution(num_list):
    l = len(num_list)
    answer = []
    for a in range(0, l):
        answer.append(num_list[a])
    if(num_list[l - 1] <= num_list[l - 2]):
        answer.append(num_list[l - 1] * 2)
    else:
        answer.append(num_list[l - 1] - num_list[l - 2])
    return answer