package question.level1;

public class RecomIdQuesition
{
    public static void main(String [] args)
    {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        System.out.println(solution("123_.def"));
        System.out.println(solution("abcdefghijklmn.p"));
    }

    public static String solution(String new_id)
    {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        char [] array = new_id.toCharArray();
        int continous = 0;
        for (int i = 0; i<new_id.length(); i++)
        {
            if (array[i] == '.')
            {
                continous++;
                if (continous >= 2)
                {
                    array[i] = '&';
                }
            } else {
                continous = 0;
            }
        }

        new_id = new String(array);
        new_id = new_id.replaceAll("&", "");
        if (new_id.charAt(0) == '.')
        {
            new_id = new_id.substring(1);
        }
        if (!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.')
        {
            new_id = new_id.substring(0, new_id.length()-1);
        }
        if (new_id.length() == 0)
        {
            new_id += "a";
        }
        if (new_id.length() >= 16)
        {
            new_id = new_id.substring(0, 15);
            if (new_id.charAt(new_id.length()-1) == '.')
            {
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }
        if (new_id.length() <= 2)
        {
            char a = new_id.charAt(new_id.length()-1);
            for (int i = new_id.length(); i < 3; i++)
            {
                new_id+=a;
            }
        }
        return new_id;
    }
}
