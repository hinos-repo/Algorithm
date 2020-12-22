n = int(input())

limit = (n+1) * 60 * 60

count = 0
for i in range(limit):
    hour = i // (60 * 60)
    # print(hour)
    remain = i % (60 * 60)
    time = remain // 60
    remain = remain % 60
    second = remain

    result = str(hour) + ":" + str(time) + ":" + str(second) + "초"
    if result.__contains__(str(3)):
        count = count + 1
        print(result)


print("끝: " + str(count))




# 책풀이 방식
count2 = 0
for i in range(n + 1):
    for j in range(60):
        for k in range(60):
            # 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
            if '3' in str(i) + str(j) + str(k):
                count2 += 1
                result = str(i) + ":" + str(j) + ":" + str(k) + "초"
                print(result)

print(count2)
print("끝: " + str(count2))

