package question;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수
{
    public static void main(String [] args)
    {
        int[] numbers = new int[]{3, 30, 34, 5, 9};
//        System.out.println(toString(numbers));
        System.out.println(solution2(numbers));
    }

    public static String solution2(int[] numbers) //정답
    {
        // 숫자를 문자열로 변환
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if (result[0].equals("0"))
        {
            return "0";
        }

        StringBuilder builder = new StringBuilder();
        for (String element : result)
        {
            builder.append(element);
        }

        String answer = new String(builder);
        return answer.equals("") ? "0" : new String(builder);
    }

    public static String solution(int[] numbers) // 오답
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

    private static String toString2(String [] result)
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
