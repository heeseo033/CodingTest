def solution(numbers):
    answer = 0
    l = len(numbers)
    for a in numbers:
        answer += a
    answer = (answer / l)
    return answer