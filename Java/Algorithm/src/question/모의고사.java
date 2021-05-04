package question;

import java.util.ArrayList;
import java.util.Collections;

public class 모의고사
{
    public static void main(String [] args)
    {
        int[] answers = {1, 3, 2, 4, 2};
        int [] result = solution(answers);
        System.out.println(result);
    }

    public static int[] solution(int[] answers)
    {
        int[] firstPattern = {1, 2, 3, 4, 5};
        int[] secondPattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;
        for(int i = 0; i < answers.length; i++)
        {
            if (firstPattern[i % firstPattern.length] == answers[i])
            {
                firstCount++;
            }
            if (secondPattern[i % secondPattern.length] == answers[i])
            {
                secondCount++;
            }
            if (thirdPattern[i % thirdPattern.length] == answers[i])
            {
                thirdCount++;
            }
        }

        int max = 0;
        if (firstCount >= secondCount && firstCount >= thirdCount)
        {
            max = firstCount;
        }
        if (secondCount >= firstCount && secondCount >= thirdCount)
        {
            max = secondCount;
        }
        if (thirdCount >= firstCount && thirdCount >= secondCount)
        {
            max = thirdCount;
        }

        ArrayList<Integer> answer = new ArrayList<Integer>();
        if (max == firstCount)
        {
            answer.add(1);
        }
        if (max == secondCount)
        {
            answer.add(2);
        }
        if (max == thirdCount)
        {
            answer.add(3);
        }

        Collections.sort(answer);
        int [] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++)
        {
            result[i] = answer.get(i);
        }
        return result;
    }
}
