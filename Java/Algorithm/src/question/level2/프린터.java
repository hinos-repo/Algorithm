package question.level2;

import java.util.LinkedList;

public class 프린터
{

    public static void main(String [] args)
    {
        int [] prio = new int[] {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(prio, location));
    }

    public static int solution(int[] priorities, int location)
    {
        LinkedList<Integer> arrData = new LinkedList<>();
        for (int element : priorities)
        {
            arrData.add(element);
        }

        int printCount = 0;
        while (-1 < location)
        {
            int first = arrData.get(0);
            boolean flag = false; // 뒤에 큰 수가 있으면 true
            for (int j = 1; j < arrData.size(); j++)
            {
                if (first < arrData.get(j))
                {
                    flag = true;
                    break;
                }
            }

            if (flag)
            {
                if (location == 0)
                {
                    location = arrData.size() -1;
                } else {
                    location--;
                }
                arrData.removeFirst();
                arrData.addLast(first);
            } else { // 큰 수가 없음
                printCount++;
                if (location == 0)
                {
                    return printCount;
                } else {
                    arrData.removeFirst();
                    location--;
                }
            }
        }
        return printCount;
    }
}
