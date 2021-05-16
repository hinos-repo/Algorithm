package question;

import java.util.Arrays;
import java.util.Collections;

public class 가장큰수
{
    public static void main(String [] args)
    {
        int[] numbers = new int[]{3, 30, 34, 5, 9};
//        System.out.println(toString(numbers));
        System.out.println(solution(numbers));
    }


    public static String solution(int[] numbers)
    {
        String answer = "";
        sortDesc(numbers);

        int maxSize = String.valueOf(numbers[0]).length();

        for (int i = 0; i < numbers.length; i++)
        {
            int j = 0;
            int temp = 0;
            int pos = 0;
            while (j < numbers.length)
            {
                int count = maxSize - String.valueOf(numbers[j]).length();
                int chanageNumber = count > 0 ? numbers[j] * (int)Math.pow(10, count) : numbers[j];
                if (temp == chanageNumber)
                {
                    pos = numbers[pos] < numbers[j] ? pos : j;
                }
                else if (temp < chanageNumber)
                {
                    temp = chanageNumber;
                    pos = j;
                }
                j++;
            }
            answer += numbers[pos];
            numbers[pos] = -1;
        }

        return answer;
    }

    private static void sortDesc(int[] arr)
    {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static String toString(int [] result)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i<result.length; i++)
        {
            builder.append(result[i]);
            if (i < result.length-1)
            {
                builder.append(",");
            }
        }
        builder.append("]");
        return new String(builder);
    }
}
