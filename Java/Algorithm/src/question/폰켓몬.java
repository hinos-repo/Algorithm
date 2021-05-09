package question;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬
{
    public static void main(String [] args)
    {
        int [] nums1 = {3, 1, 2, 3};
        System.out.println(solution(nums1));
        int [] nums2 = {3,3,3,2,2,4};
        System.out.println(solution(nums2));
        int [] nums3 = {3,3,3,2,2,2};
        System.out.println(solution(nums3));
    }

    static int solution(int[] nums)
    {
        int N = nums.length / 2;
        Set<String> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            result.add(String.valueOf(nums[i]));
        }

        return Math.min(result.size(), N);
    }
}
