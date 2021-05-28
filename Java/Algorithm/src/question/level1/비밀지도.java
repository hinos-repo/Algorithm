package question.level1;

import java.util.Collections;
import java.util.LinkedList;

public class 비밀지도
{

    public static void main(String[] args)
    {
        int N = 5;
        int [] arr1 = {9, 20, 28, 18, 11};
        int [] arr2 = {30, 1, 21, 17, 28};

        String [] result = solution(N, arr1, arr2);
        System.out.println(toString(result));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2)
    {
        String[] answer = new String[n];
        for (int i = 0; i <n; i++)
        {
            int temp1[] = getBinaryArray(arr1[i], n);
            int temp2[] = getBinaryArray(arr2[i], n);

            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < n; j++)
            {
                if (temp1[j] == 0 && temp2[j] == 0)
                {
                    builder.append(" ");
                } else {
                    builder.append("#");
                }
            }
            answer[i] = new String(builder);
        }
        return answer;
    }

    private static int[] getBinaryArray(int value, int n)
    {
        LinkedList<Integer> binary = new LinkedList<>();
        while(value > 0)
        {
            binary.addFirst(value % 2);
            if (value == 1)
                break;
            value /= 2;
        }
        int size = binary.size();
        for (int i = 0; i < n - size; i++)
        {
            binary.addFirst(0);
        }

        int [] temp = new int[n];
        for (int i = 0; i < binary.size(); i++)
        {
            temp[i] = binary.get(i);
        }
        binary.clear();

        return temp;
    }

    private static String toString(Object [] result)
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
