package question.level2;


import java.util.HashMap;

public class 전화번호목록
{
    public static void main(String[] args)
    {

        String [] phone_book1 = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book1));

        String [] phone_book2 = {"123","456","789"};
        System.out.println(solution(phone_book2));

        String [] phone_book3 = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book3));

    }

    private static boolean solution(String [] phone_book)
    {
        HashMap<String, String> hash = new HashMap<>();

        int largeLength = 0;
        for (String number : phone_book)
        {
            if (largeLength < number.length())
            {
                largeLength = number.length();
            }
            hash.put(number, number);
        }

        for (String number : phone_book)
        {
            for (int i = 1; i < number.length(); i++)
            {
                if (i > largeLength)
                {
                    break;
                }
                String str = hash.get(number.substring(0, i));
                if (str != null)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
