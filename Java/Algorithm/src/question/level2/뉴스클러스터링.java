package question.level2;

import java.util.*;
import java.util.regex.Pattern;

/**
 * 프로그래머스 문제
 * https://programmers.co.kr/learn/courses/30/lessons/17677?language=java
 * */

public class 뉴스클러스터링
{
    public static void main(String [] args)
    {
        String str1 = "FRANCE";
        String str2 = "french";
        System.out.println(assertValue(str1, str2));


        str1 = "handshake";
        str2 = "shake hands";
        System.out.println(assertValue(str1, str2));


        str1 = "aa1+aa2";
        str2 = "AAAA12";
        System.out.println(assertValue(str1, str2));


        str1 = "E=M*C^2";
        str2 = "e=m*c^2";

        System.out.println(assertValue(str1, str2));

    }

    private static int assertValue(String str1, String str2)
    {
        ArrayList<String> arr1 = convertArray(str1.toLowerCase());
        ArrayList<String> arr2 = convertArray(str2.toLowerCase());

        Set<String> set = new HashSet<>();
        set.addAll(arr1);
        set.addAll(arr2);

        HashMap<String, Integer> map1 = stringSetMap(arr1);
        HashMap<String, Integer> map2 = stringSetMap(arr2);

        int union = 0;
        int intersection = 0;
        Iterator<String> iter = set.iterator();
        while (iter.hasNext())
        {
            String key = iter.next();

            int max = Math.max(map1.getOrDefault(key, 0), map2.getOrDefault(key, 0));
            int min = Math.min(map1.getOrDefault(key, 0), map2.getOrDefault(key, 0));

            for (int j = 0; j < max; j++)
            {
                union++;
            }
            for (int j = 0; j < min; j++)
            {
                intersection++;
            }
        }

        float result = (float) intersection / (float) union;
        return (union == 0) ? 65536 : (int)(result * 65536);
    }

    private static ArrayList convertArray(String str)
    {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i<str.length()-1; i++)
        {
            String element = String.valueOf(str.charAt(i)) + str.charAt(i + 1);
            if (isEnglish(element))
            {
                result.add(element);
            }
        }
        return result;
    }

    private static HashMap<String, Integer> stringSetMap(ArrayList<String> list)
    {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i< list.size(); i++)
        {
            String key = list.get(i);
            if (map.get(key) == null)
            {
                map.put(key, 1);
            } else {
                int count = map.get(key);
                map.put(key, ++count);
            }
        }
        return map;
    }

    private static boolean isEnglish(String str)
    {
        return Pattern.matches("^[a-zA-Z]*$", str) && !str.contains(" ");
    }
}
