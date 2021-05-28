package question.level2;

public class 나라124
{
    public static void main(String [] args)
    {
        for (int i = 1; i <= 50; i++)
        {
            System.out.println(i + " : " + solution(i));
        }

        // 1    2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18  19  20
        // 1    2   4   11  12  14  21  22  24  41  42  44  111 112 114 121 122 124 141 142

        // 0    0   1   1   1   2   2   2   3   3   3   4   4   4   5   5   5   6   6   6
        // 0    0   0   1   1   1   2   2   2   4   4   4   11  11  11  12  12  12  14  14
    }

    public static String solution(int n)
    {
        String result = "";
        if (n < 3)
        {
            result = String.valueOf(n);
            return result;
        }
        StringBuilder builder = new StringBuilder();
        while(n >= 3)
        {
            int etc = n % 3;
            n = n / 3;
            if (etc == 0)
            {
                n--;
                builder.insert(0, "4");
            } else {
                builder.insert(0, etc);
            }
            if (n < 3 && n != 0)
            {
                builder.insert(0, n);
            }
        }
        result = new String(builder);
        return result;
    }
}
