# 선택정렬 예제
# 꼭 Swife를 해줘야함

data = [6, 4, 8, 2, 1, 9, 10, 7, 5, 3]
for i in range(len(data)):
    min_index = i
    for j in range(i + 1, len(data)):
        if data[min_index] > data[j]:
            min_index = j

    temp = data[i]
    data[i] = data[min_index]
    data[min_index] = temp

print(data)