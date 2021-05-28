package question.level2;


import java.util.*;

public class 더맵게
{
    public static void main(String[] args)
    {

        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        System.out.println(solution(scoville, 7));
    }

    public static int solution(int[] scoville, int k)
    {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++)
        {
            heap.add(scoville[i]);
        }

        while (heap.peek() < k)
        {
            if (heap.size() == 1)
            {
                return -1;
            }

            int temp1 = heap.poll();
            int temp2 = heap.poll();

            heap.add(temp1 + temp2 * 2);

            answer++;
        }
        return answer;
    }
}
