package question.level2;

import test.MyUtil;

public class 타겟_넘버
{
    public static void main(String[] args)
    {
        int [] numbers = new int[] {1, 1, 1};
        int target = 3;

        System.out.println(solution1(numbers, target));
        System.out.println("------------------------");
        System.out.println(solution2(numbers, target));
    }

    static int answer1 = 0;
    static int answer2 = 0;
    public static int solution1(int[] numbers, int target)
    {
        dfs1(numbers, target, 0);
        return answer1;
    }

    public static int solution2(int[] numbers, int target)
    {
        dfs2(numbers, target, 0);
        return answer2;
    }


    public static void dfs1(int[] numbers, int target, int node)
    {
        if (node == numbers.length)
        {
            System.out.println(MyUtil.toString(numbers));
            int sum = 0;
            for (int num : numbers)
            {
                sum += num;
            }
            if (sum == target)
            {
                answer1++;
            }
        }
        else {
            numbers[node] *= 1;
            dfs1(numbers, target, node + 1);

            numbers[node] *= -1;
            dfs1(numbers, target, node + 1);
        }
    }

    public static void dfs2(int[] numbers, int target, int node)
    {
        if (node == numbers.length)
        {
            System.out.println(MyUtil.toString(numbers));
            int sum = 0;
            for (int num : numbers)
            {
                sum += num;
            }
            if (sum == target)
            {
                answer2++;
            }
        }
        else {
            numbers[node] = 1;
            dfs2(numbers, target, node + 1);

            numbers[node] = -1;
            dfs2(numbers, target, node + 1);
        }
    }
}
