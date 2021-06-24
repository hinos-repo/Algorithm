package question.level2;

import test.MyUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class 메뉴
{
    public static void main(String[] args)
    {


//        System.out.println(MyUtil.toString
//                (
//                solution(
//                        new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"},
//                        new int[]{2, 3, 4}
//                        )
//                )
//        );

        System.out.println(MyUtil.toString
                (
                        solution(
                                new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"},
                                new int[]{2,3,5}
                        )
                )
        );

        // 정답은 ["ACD", "AD", "ADE", "CD", "XYZ"]인데 DE도 포함되어야 되는거 아닌가?

//        System.out.println(MyUtil.toString
//                (
//                        solution(
//                                new String[]{"XYZ", "XWY", "WXA"},
//                                new int[]{2,3,4}
//                        )
//                )
//        );

    }

    static void bfs(HashSet<String>set, String order, StringBuilder builder, boolean [] visited, int depth, int count)
    {
        if (builder.length() == count)
        {
            char [] arr = builder.toString().toCharArray();
            Arrays.sort(arr);
            set.add(new String(arr));
            return;
        }

        for (int i = 0; i < order.length(); i++)
        {
            if (!visited[i])
            {
                visited[i] = true;
                builder.append(order.charAt(i));
                bfs(set, order, builder, visited, depth+1, count);
                builder.deleteCharAt(depth);
                visited[i] = false;
            }
        }
    }


    private static String[] solution(String[] orders, int[] courses)
    {
        HashSet<String> result = new HashSet();
        for (int i = 0; i < courses.length; i++) {
            int course = courses[i];
            for (String order : orders)
            {
                HashSet<String> set = new HashSet<>();
                bfs(set, order, new StringBuilder(), new boolean[order.length()], 0, course);
                if (!set.isEmpty())
                {
                    System.out.println(set);
                }
            }

        }
        return new String[3];
    }
}
