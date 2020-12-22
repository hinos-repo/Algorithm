# 10진수를 3진법으로 변환
# 3진수를 reverse하고 10진법으로 출력

def solution(n):
    strResult = ''
    answer = 0
    flag = True
    mok = n
    while (flag):
        etc = (int)(mok % 3)
        mok = (int)(mok / 3)
        if mok < 3:
            flag = False
            strResult = strResult + str(etc) + str(mok)
        else:
            strResult = strResult + str(etc)

    strResult = ''.join(reversed(strResult))
    for i in range(len(strResult)):
        answer = answer + int(strResult[i]) * pow(3, i)

    return answer

print(pow(3, 0))