package question.level2;

import java.util.HashSet;

public class 소수찾기
{
    static HashSet<Integer> set = new HashSet<Integer>();

    public static void main(String[] args)
    {
        String numbers = "011";
        System.out.println(solution(numbers));
    }

    static int solution(String numbers)
    {
        bfs(numbers, new StringBuilder(), new boolean[numbers.length()], 0);
        return set.size();
    }

    static boolean isDecimal(int element)
    {
        if (element <= 1)
            return false;
        for (int i = 2; i < (element/2)+1; i++)
        {
            int mok = element % i;
            if (mok == 0)
            {
                return false;
            }
        }
        return true;
    }

    // 1 2 3 4

    static void bfs(String data, StringBuilder builder, boolean [] visited, int depth)
    {
        if (depth == data.length())
        {
            return;
        }

        for (int i = 0; i < data.length(); i++)
        {
            if (!visited[i])
            {
                builder.append(data.charAt(i));
                if (isDecimal(Integer.parseInt(builder.toString())))
                {
                    set.add(Integer.parseInt(builder.toString()));
                }
                visited[i] = true;
                bfs(data, builder, visited, depth+1);
                visited[i] = false;
                builder.deleteCharAt(depth);
            }
        }
    }
}
