package question.level2;

import test.MyUtil;

public class 큰수만들기
{
    public static void main(String[] args)
    {
        String number1 = "1924"; // 94
        int k1 = 2;

        System.out.println(solution1(number1, k1));
        System.out.println(solution2(number1, k1));

        String number2 = "1234214"; // 3234
        int k2 = 4;

        System.out.println(solution1(number2, k2));
        System.out.println(solution2(number2, k2));

        String number3 = "4177252841"; //775841
        int k3 = 4;

        System.out.println(solution1(number3, k3));
        System.out.println(solution2(number3, k3));
    }

    static String solution1(String number, int k)
    {
        StringBuilder builder = new StringBuilder(number);
        while (k > 0)
        {
            for (int i = 0; i < builder.length()-k; i++)
            {
                if (builder.charAt(i) < builder.charAt(i+1))
                {
                    builder.deleteCharAt(i);
                    k--;
                    break;
                }
            }
        }
        return new String(builder);
    }

    static String solution2(String number, int k)
    {
        int maxPosition = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number.length() - k; i++)
        {
            char max = 0;
            for (int j = maxPosition; j <= k + i; j++)
            {
                if (max < number.charAt(j))
                {
                    max = number.charAt(j);
                    maxPosition = j + 1;
                }
            }
            builder.append(max);
        }
        return new String(builder);
    }
}
