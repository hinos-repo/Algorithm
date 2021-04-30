package question;

import java.util.Arrays;

public class MarathonQuestion
{
    public static void main(String [] args)
    {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution1(participant, completion));
        System.out.println(solution2(participant, completion));
    }

    public static String solution1(String[] participant, String[] completion)
    {
        String result = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i<completion.length; i++)
        {
            if (!participant[i].equals(completion[i]))
            {
                result = participant[i];
                break;
            }
        }
        if (result.equals(""))
        {
            result = participant[completion.length];
        }
        return result;
    }

    public static String solution2(String[] participant, String[] completion)
    {
        String result = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i<completion.length; i++)
        {
            if (!participant[i].equals(completion[i]))
            {
                result = participant[i];
                break;
            }
        }
        if (result.equals(""))
        {
            result = participant[completion.length];
        }
        return result;
    }
}
