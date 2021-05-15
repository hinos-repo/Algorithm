package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch
{
    public static void main(String [] args)
    {
        int[] data = new int[]{11, 12, 13, 18, 19, 20, 25, 29, 30, 36};
        int[] reverseData = reverseArray(data);
        for (int i = 0; i < data.length; i++)
        {
            System.out.println(binarySearchAsc(data, data[i]));
            System.out.println(binarySearchDesc(reverseData, reverseData[i]));
        }

        ArrayList<MyData> arrData = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            arrData.add(new MyData(i, String.valueOf(i << i)));
        }

        int position = getListPosition(arrData, 8);
        System.out.println(arrData);
        System.out.println(position == 8);
    }

    private static int[] reverseArray(int [] data)
    {
        int [] result = new int[data.length];

        int j = 0;
        for (int i = data.length-1; i >= 0; i--)
        {
            result[j] = data[i];
            j++;
        }
        return result;
    }

    private static int binarySearchAsc(int [] data, int value)
    {
        int start = 0;
        int end = data.length-1;
        int mid = 0;

        while (start <= end)
        {
            mid = (start + end)/2;
            if (data[mid] == value)
            {
                return mid;
            }
            else if (data[mid] < value)
            {
                start = mid+1;
            }
            else if(data[mid] > value)
            {
                end = mid-1;
            }
        }
        return -1;
    }

    private static int binarySearchDesc(int [] data, int value)
    {
        int start = 0;
        int end = data.length-1;
        int mid = 0;

        while (start <= end)
        {
            mid = (start + end)/2;
            if (data[mid] == value)
            {
                return mid;
            }
            else if (data[mid] > value)
            {
                start = mid+1;
            }
            else if(data[mid] < value)
            {
                end = mid-1;
            }
        }
        return -1;
    }

    private static int getListPosition(ArrayList<MyData> arrData, int seq)
    {
        int start = 0;
        int end = arrData.size()-1;
        int mid = 0;

        while (start <= end)
        {
            mid = (start + end)/2;
            if (arrData.get(mid).seq == seq)
            {
                return mid;
            }
            else if (arrData.get(mid).seq < seq)
            {
                start = mid+1;
            }
            else if(arrData.get(mid).seq > seq)
            {
                end = mid-1;
            }
        }
        return -1;
    }

    static class MyData
    {
        int seq = 0;
        String hash = "";

        public MyData(int seq, String hash)
        {
            this.seq = seq;
            this.hash = hash;
        }

        @Override
        public String toString() {
            return "MyData{" +
                    "seq=" + seq +
                    ", hash='" + hash + '\'' +
                    '}';
        }
    }
}
