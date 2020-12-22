# 0 북쪽 : TOP
# 1 동쪽 : RIGHT
# 2 남쪽 : BOTTOM
# 3 서쪽 : LEFT


# n, m = map(int, input().split())
# cx, cy, cd = map(int, input().split())
#
# mapList = []
# for i in range(n):
#     mapList.append(list(input().split()))




# stack = []
#
# stack.append(5)
# stack.append(2)
# stack.pop()
#
# print(stack)

def factorial_recursive(n):
    print(n)
    if n <= 1:
        return 1
    result = n * factorial_recursive(n - 1)
    return result

print(factorial_recursive(3))