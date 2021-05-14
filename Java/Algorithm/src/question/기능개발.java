package question;

import java.util.ArrayList;

public class 기능개발
{

    public static void main(String [] args)
    {
        int [] progresss1 = {93, 30, 55};
        int [] speeds1 = {1, 30, 5};
        int [] result1 = {2, 1};

        int [] progresss2 = {95, 90, 99, 99, 80, 99};
        int [] speeds2 = {1, 1, 1, 1, 1, 1};
        int [] result2 = {1, 3, 2};


        System.out.println("결과 : " + toString(solution(progresss1, speeds1)));
        System.out.println("정답 : " + toString(result1));

        System.out.println();

        System.out.println("결과 : " + toString(solution(progresss2, speeds2)));
        System.out.println("정답 : " + toString(result2));
    }

    public static int[] solution(int[] progresses, int[] speeds)
    {
        ArrayList<Integer> answer = new ArrayList<>(progresses.length);
        int temp = 0;
        int count = 1;
        for (int i = 0; i < progresses.length; i++)
        {
            int remain = 100 - progresses[i];
            int speed = speeds[i];

            int mok = remain / speed;
            int etc = remain % speed;
            int day = etc == 0 ? mok : mok+1;

            if (i == 0)
            {
                temp = day;
            }
            else if (day <= temp)
            {
                count++;
            }
            else {
                answer.add(count);
                count = 1;
                temp = day;
            }

            if (i == progresses.length-1)
            {
                answer.add(count);
            }
        }

        int [] result = new int[answer.size()];

        for (int i = 0; i <answer.size(); i++)
        {
            result[i] = answer.get(i);
        }
        return result;
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
