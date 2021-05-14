package question;

import java.util.*;

public class 삼진법뒤집기
{
    public static void main(String [] args)
    {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }

    public static int solution(int n)
    {
        ArrayList<String> arr = new ArrayList<>();
        while(n >= 3)
        {
            int etc = n % 3;
            n = n / 3;
            arr.add(String.valueOf(etc));
            if(n < 3)
            {
                arr.add(String.valueOf(n));
            }
        }
        int result = 0;
        int j = 0;
        for (int i = arr.size()-1; i >= 0; i--)
        {
            result +=  (int)Math.pow(3, i) * Integer.parseInt(arr.get(j));
            j++;
        }

        return result;
    }
}
