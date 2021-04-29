package set;

import java.util.*;

public class SetExample
{
    public static void main(String [] args)
    {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>(5);
        for (int i = 0; i<10; i++)
        {
            arr1.add(String.valueOf(i));
            if (i >= 5)
            {
                arr2.add(String.valueOf(i));
            }
        }

        System.out.println(arr1);
        System.out.println(arr2);

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("0");
        arr3.add("9");
        arr3.add("10");
        ArrayList<String> arr4 = intersection(arr1, arr3);

        System.out.println(arr4);
        System.out.println(arr1);

        System.out.println();
        System.out.println();
        System.out.println(difference(arr1, arr2));
    }

    private static <T> ArrayList<T> union(ArrayList<T> list1, ArrayList<T> list2) // 합집합
    {
        Set<T> set = new HashSet<T>(15);
        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<T>(set);
    }

    private static <T> ArrayList<T> intersection(ArrayList<T> list1, ArrayList<T> list2) // 교집합
    {
        ArrayList<T> result = new ArrayList<>(15);
        result.addAll(list1);
        result.retainAll(list2);
        return result;
    }

    private static <T> ArrayList<T> difference(ArrayList<T> list1, ArrayList<T> list2)
    {
        ArrayList<T> result = new ArrayList<>(15);
        result.addAll(list1);
        result.removeAll(list2);
        return result;
    }
}
