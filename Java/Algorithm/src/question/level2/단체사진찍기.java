package question.level2;

import test.MyUtil;

import java.util.HashMap;

public class 단체사진찍기
{
    static HashMap<String, Integer> mapping = new HashMap<>();

    public static void main(String[] args)
    {
        mapping.put("A", 1);
        mapping.put("B", 2);
        mapping.put("C", 3);
        mapping.put("D", 4);

//        allCase(0, new int[4], new int[]{1, 2, 3, 4});

        makeCase(0, new int[3], new int[]{1, 2, 3});

    }

    static int makeCase(int idx, int[] aCase, int[] left)
    {
        int cnt = 0;
        if(idx == aCase.length)
        {
            System.out.println( MyUtil.toString(aCase));
        }
        for(int i = 0; i < aCase.length; i++)
        {
            if (left[i] != 0)
            {
                aCase[idx] = left[i];
                left[i] = 0;
                cnt += makeCase(idx + 1, aCase, left);
                left[i] = aCase[idx];
                aCase[idx] = 0;
            }
        }
        return cnt;
    }
    private static int allCaseCount(int n)
    {
        if (n == 1)
        {
            return n;
        }
        return allCaseCount(n-1) * n;
    }
}
