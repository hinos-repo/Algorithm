# 삽입정렬

# 삽입 정렬은 특정한 데이터를 적절한 위치에 삽입한다는 의미에서 삽입 정렬이라고 부른다.
# 더불어 삽입 정렬은 특정한 데이터가 적절한 위치에 들어가기 이전에 그앞까지의 데이터는 이미 정렬되어 있다고 가정한다.
# 정렬되어 있는 데이터 리스트에서 적절한 위치를 찾은 뒤에, 그 위치에 삽입된다는 점이 특징이다.


list = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(1, len(list)):
    for j in range(i, 0, -1):
        if list[j] < list[j-1]:
            temp = list[j]
            del list[j]
            list.insert(j-1, temp)

print(list)
