# 어떠한 수 N이 1이 될 때까지 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다.
# 단, N이 17, k가 4라고 가정하자. 이때 1번의 과정을 한 번 수행하면 N은 16이 된다.
# 1. N에서 1을 뺀다.
# 2. N을 K로 나눈다.

def minus(nData):
    global count
    count = count + 1
    return nData - 1


def divide(nData, kData):
    global count
    count = count + 1
    return nData // kData


n, k = map(int, input().split())

count = 0

while n > 1:

    while True:
        if n % k == 0:
            n = divide(n, k)
        else:
            break

    if n > 1:
        n = minus(n)

print(count)