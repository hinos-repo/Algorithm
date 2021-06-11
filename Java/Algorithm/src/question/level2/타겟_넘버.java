package question.level2;

import java.util.ArrayList;

public class 타겟_넘버
{
    public static void main(String[] args)
    {
        int [] numbers = new int[] {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(solution(numbers, target));
    }

    static int answer = 0;

    public static int solution(int[] numbers, int target)
    {
        dfs(numbers, target, 0);
        return answer;
    }

    public static void dfs(int[] numbers, int target, int node)
    {
        if (node == numbers.length)
        {
            int sum = 0;
            for (int num : numbers)
            {
                sum += num;
            }
            if (sum == target)
            {
                answer++;
            }
        }
        else {
            numbers[node] *= 1;
            dfs(numbers, target, node + 1);

            numbers[node] *= -1;
            dfs(numbers, target, node + 1);
        }
    }
}
