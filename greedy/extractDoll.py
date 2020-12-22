board = [[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]]
moves = [1,5,3,5,1,2,1,4]

size = len(board)
arrResult = []

count = 0

for m in moves:
    row = m - 1
    for i in range(size):
        value = board[i][row]
        if value != 0:
            board[i][row] = 0
            arrResult.append(value)
            resultLength = len(arrResult)
            if resultLength >= 2:
                if arrResult[resultLength - 2] == arrResult[resultLength - 1]:
                    del arrResult[resultLength - 1]
                    del arrResult[resultLength - 2]
                    count = count + 2
            break

print(count)

answer = 0
for i in moves:
    for j in range(len(board)):
        if board[j][i-1] != 0:
            arrResult.append(board[j][i-1])
            board[j][i-1] = 0

            if len(arrResult) > 1:
                if arrResult[-1] == arrResult[-2]:
                    arrResult.pop(-1)
                    arrResult.pop(-1)
                    answer += 2
            break


print(answer)