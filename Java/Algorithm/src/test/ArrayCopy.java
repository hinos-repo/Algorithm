package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayCopy
{

    public static void main(String [] args)
    {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 11; i++)
        {
            arr.add(String.valueOf(i));
        }
        int [] org = {1, 2, 3, 4};
        int [] copy = {5, 6, 7, 8};
        int [] copy2 = {5, 6, 7, 8};
        // 5 6 3 4
//        System.arraycopy(org, 2, copy, 1, 1);
//        System.arraycopy(org, 2, copy2, 1, 2);
//        System.out.println(result(copy));
//        System.out.println(result(copy2));

        System.out.println(test(5));
    }

    private static String result(int [] data)
    {
        String result = "";
        for (int i = 0; i < data.length; i++)
        {
            result += String.valueOf(data[i]);
            if (i != data.length -1)
            {
                result += ", ";
            }
        }
        return result;
    }

    private static int test(int value)
    {
        if (value == 1)
        {
            return 1;
        } else {
            return value * test(value-1);
        }
    }
}
