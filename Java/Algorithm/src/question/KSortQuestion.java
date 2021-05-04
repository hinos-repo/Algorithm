package question;
import java.util.Arrays;

public class KSortQuestion
{
    public static void main(String [] args)
    {
        int [] array = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands =
                {
                        {2, 5, 3},
                        {4, 4, 1},
                        {1, 7, 3}
                };

        int [] result = solution(array, commands);

        for (int a = 0; a<result.length; a++)
        {
            System.out.println(result[a]);
        }

        System.out.println(result);

    }

    public static int [] solution(int [] array, int [][] commands)
    {
        int [] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++)
        {
            int first = commands[i][0]-1;
            int end = commands[i][1]-1;
            int select = commands[i][2]-1;

            int [] temp = new int[end - first + 1];
            int tmp = first;
            for (int j = 0; j < temp.length; j++)
            {
                if(tmp <= end)
                {
                    temp[j] = array[tmp];
                    tmp++;
                }
            }
            Arrays.sort(temp);
            result[i] = temp[select];
        }
        return result;
    }
}
