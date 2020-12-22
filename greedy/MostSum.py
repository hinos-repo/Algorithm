n, m, k = map(int, input().split())

# n 배열의 크기
# m 숫자가 더해지는 횟수
# k 연속으로 더할 수 있는 횟수

data = list(map(int, input().split()))

data.sort(reverse=True)

mostNum = data[0]
subNum = data[1]

sum = 0
over = 0

for i in range(0, m):
    temp = 0
    if over < k:
        temp = mostNum
        over = over + 1
    else:
        temp = subNum
        over = 0
    sum += temp

print(sum)