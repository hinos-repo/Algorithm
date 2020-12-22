# 왕실의 나이트

# 체스판은 8 x 8
# 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
# 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
# 행 위치를 표현할 때는 1부터 8로 표현하고 열 위치를 표현할 떄는 a부터 h로 표현한다.


# mySolution1
def solution1(pos):
    rowList = {
        '1': 'a', '2': 'b', '3': 'c', '4': 'd', '5': 'e', '6': 'f', '7': 'g', '8': 'h',
        'a': '1', 'b': '2', 'c': '3', 'd': '4', 'e': '5', 'f': '6', 'g': '7', 'h': '8'
    }

    nCount = 0

    # c2
    hang = pos[1]
    row = rowList[pos[0]]

    # leftTop
    if (int(row) - 2) >= 1 and int(hang) - 1 >= 1:
        nCount = nCount + 1

    # leftBottom
    if (int(row) - 2) >= 1 and int(hang) + 1 <= 8:
        nCount = nCount + 1

    # rightTop
    if (int(row) + 2) >= 1 and int(hang) - 1 >= 1:
        nCount = nCount + 1

    # rightBottom
    if (int(row) + 2) >= 1 and int(hang) + 1 <= 8:
        nCount = nCount + 1

    # bottomLeft
    if (int(hang) - 2) >= 1 and int(row) - 1 >= 1:
        nCount = nCount + 1

    # bottomRight
    if (int(hang) - 2) >= 1 and int(row) + 1 <= 8:
        nCount = nCount + 1

    # topLeft
    if (int(hang) + 2) >= 1 and int(row) - 1 >= 1:
        nCount = nCount + 1

    # topRight
    if (int(hang) + 2) >= 1 and int(row) + 1 <= 8:
        nCount = nCount + 1

    return nCount


def solution2(pos):
    rowList = {
        '1': 'a', '2': 'b', '3': 'c', '4': 'd', '5': 'e', '6': 'f', '7': 'g', '8': 'h',
        'a': '1', 'b': '2', 'c': '3', 'd': '4', 'e': '5', 'f': '6', 'g': '7', 'h': '8'
    }
    steps = [(2, 1), (2, -1), (-2, 1), (-2, -1), (-1, -2), (-1, 2), (1, -2), (1, 2)]

    nCount = 0

    hang = pos[1]
    row = rowList[pos[0]]

    for step in steps:
        next_row = int(row) + step[0]
        next_hang = int(hang) + step[1]

        if (1 <= next_row <= 8) and (1 <= next_hang <= 8):
            nCount += 1
    return nCount


pos = str(input())
print(str(solution1(pos)))
print(str(solution2(pos)))
