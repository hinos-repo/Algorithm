package question.level2;

import java.util.*;
public class 짝지어_제거하기
{
    public static void main(String[] args)
    {
        System.out.println(solution1("baabaa"));
        System.out.println(solution1("cdcd"));
    }

    private static int solution1(String s) //효율성 통과X
    {
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
        {
            arr.add(s.charAt(i));
        }

        for (int i = arr.size()-1; i > 0; i--)
        {
            if (arr.get(i).equals(arr.get(i-1)))
            {
                arr.remove(i);
                arr.remove(i-1);
                i = Math.min(i+2, arr.size());
            }
        }

        return arr.isEmpty() ? 1 : 0;
    }

    private static int solution2(String s) //효율성 통과
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            if (stack.isEmpty())
            {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() == s.charAt(i))
                {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
