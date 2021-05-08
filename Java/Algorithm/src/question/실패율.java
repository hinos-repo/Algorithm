package question;

import java.util.LinkedList;

public class 실패율
{
    public static void main(String [] args)
    {
        int N1 = 5;
        int [] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(toString(solution(N1, stages1)));

        int N2 = 4;
        int [] stages2 = {4,4,4,4,4};
        System.out.println(toString(solution(N2, stages2)));
    }

    public static int[] solution(int N, int[] stages)
    {
        int[] index = new int[N];
        float[] value = new float[N];

        for(int i = 0; i < N; i++)
        {
            int failCount = 0;
            int stageSum = 0;

            for(int j = 0; j < stages.length; j++)
            {
                if(stages[j] != -1)
                {
                    stageSum++;
                } else {
                    continue;
                }
                if(i+1 >= stages[j])
                {
                    stages[j] = -1;
                    failCount++;
                }
            }
            index[i] = i+1;
            value[i] = (failCount / (float)stageSum);
        }

        bubbleSort(index, value);

        return index;
    }

    public static void bubbleSort(int [] index, float [] value)
    {
        int i = value.length-1;
        while(i > 0)
        {
            for(int j = 0; j < i; j++)
            {
                if(value[j] < value[j+1])
                {
                    float select = value[j];
                    value[j] = value[j+1];
                    value[j+1] = select;

                    int tempIndex = index[j];
                    index[j] = index[j+1];
                    index[j+1] = tempIndex;
                }
            }
            i--;
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
                builder.append(", ");
            }
        }
        builder.append("]");
        return new String(builder);
    }
}
