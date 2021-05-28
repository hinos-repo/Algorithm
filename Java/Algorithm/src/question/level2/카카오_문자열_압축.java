package question.level2;

import java.util.HashMap;
import java.util.Iterator;

public class 카카오_문자열_압축
{
    // aabbcaabb

    public static void main(String [] args)
    {
        HashMap<String, Integer> testData = new HashMap<>();
        // 2a2bac2c
        // ac2c
        testData.put("aabbaccc", 7);
        testData.put("ababcdcdababcdcd", 9);
        testData.put("abcabcdede", 8);
        testData.put("abcabcabcabcdededededede", 14);
        testData.put("xababcdcdababcdcd", 17);


        Iterator iterator = testData.keySet().iterator();
        while (iterator.hasNext())
        {
            String key = (String)iterator.next();
            System.out.println(key + ":" + ((solution(key) == testData.get(key)) ? "성공" : "실패") );
        }
    }

    static int solution(String s)
    {
        if (s.length() == 1)
            return 1;

        int resultCount = 1000;
        for (int i = 1; i < (s.length() / 2) + 1; i++)
        {
            String result = "";
            String prev = "";
            int count = 1;
            for(int j = 0; j < (s.length() / i) + 1; j++)
            {
                int start = j * i;
                int end = start+i;
                if (end > s.length())
                {
                    end = s.length();
                }

                String current = s.substring(start, end);
                if (prev.equals(current) && !prev.equals(""))
                {
                    count++;
                    continue;
                }
                prev = current;
                result += parseString(count, prev);
                count = 1;
            }
            System.out.println(i + "묶음 : " + result);
            if (resultCount > result.length())
            {
                resultCount = result.length();
            }

        }
        return resultCount;
    }

    static String parseString(int count, String str)
    {
        if (count <= 1)
        {
            return str;
        }
        return count+str;
    }
}
