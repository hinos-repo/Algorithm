package question.level2;

import java.util.HashMap;

public class 단체사진찍기
{
    static HashMap<String, Integer> mapping;
    static String [] conditions;

    static int count = 0;

    public static void main(String[] args)
    {
        System.out.println(solution(2, new String[]{"N~F=0", "R~T>2"}));
    }

    static int solution(int n, String[] data)
    {
        conditions = data;
        mapping = new HashMap<>();

        mapping.put("A", 1);
        mapping.put("C", 2);
        mapping.put("F", 3);
        mapping.put("J", 4);
        mapping.put("M", 5);
        mapping.put("N", 6);
        mapping.put("R", 7);
        mapping.put("T", 8);

        int [] arrData = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int [] arrOutput = new int[arrData.length];
        boolean [] arrAccess = new boolean[arrData.length];

        bfs(arrData, arrOutput, arrAccess, 0);

        return count;
    }



    static void bfs(int [] arrData, int [] output, boolean [] arrAccess, int depth)
    {
        if (arrData.length == depth)
        {
            if (isCheck(output))
            {
                count++;
            }
            return;
        }
        for (int i = 0; i < arrData.length; i++)
        {
            if (!arrAccess[i])
            {
                output[depth] = arrData[i];
                arrAccess[i] = true;
                bfs(arrData, output, arrAccess, depth+1);
                arrAccess[i] = false;
            }
        }
    }

    static boolean isCheck(int [] output)
    {
        for (int i = 0; i < conditions.length; i++)
        {
            String character1 = conditions[i].substring(0, 1);
            String character2 = conditions[i].substring(2, 3);
            String operator = conditions[i].substring(3, 4);
            int seperate = Integer.parseInt(conditions[i].substring(4, 5));

            int index1 = getIndex(output, mapping.get(character1));
            int index2 = getIndex(output, mapping.get(character2));

            int index = Math.abs(index2 - index1)-1;

            if (operator.equals("="))
            {
                if (index == seperate)
                {
                    continue;
                } else {
                    return false;
                }
            }
            else if(operator.equals("<"))
            {
                if (seperate > index)
                {
                    continue;
                } else {
                    return false;
                }
            }
            else {
                if (seperate < index)
                {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    static int getIndex(int [] output, int value)
    {
        for (int i = 0; i < output.length; i++)
        {
            if (output[i] == value)
            {
                return i;
            }
        }
        return -1;
    }
}
