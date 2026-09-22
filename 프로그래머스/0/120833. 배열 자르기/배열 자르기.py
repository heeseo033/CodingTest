def solution(numbers, num1, num2):
    answer = []
    for a in range(num1, num2 + 1):
        answer.append(numbers[a])
        
    return answer