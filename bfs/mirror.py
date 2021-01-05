from collections import deque

# n, m = map(int, input().split())
#
# data = []
# for i in range(n):
#     data.append(list(map(int, input())))

n = 5
m = 6

data = \
    [
        [1, 0, 1, 0, 1, 0],
        [1, 1, 1, 1, 1, 1],
        [0, 0, 0, 0, 0, 1],
        [1, 1, 1, 1, 1, 1],
        [1, 1, 1, 1, 1, 1]
    ]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    que = deque()
    que.append((x, y))

    while que:
        x, y = que.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            if data[nx][ny] == 1:
                data[nx][ny] = data[x][y] + 1
                que.append((nx, ny))


    return data[n-1][m-1]



print(bfs(0, 0))
print(data)
