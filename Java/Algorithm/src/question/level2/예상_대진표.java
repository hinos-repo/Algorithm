package question.level2;

import java.util.ArrayList;

public class 예상_대진표
{
    public static void main(String[] args)
    {
        int N = 8;
        int A = 4;
        int B = 7;

        myLog(N, A, B, solution(8, 4, 7));
    }

    private static int solution(int N, int A, int B)
    {
        ArrayList<Node> arr1 = new ArrayList<>();
        ArrayList<Node> arr2 = new ArrayList<>();

        for (int i = 1; i <= N; i++)
        {
            arr1.add(new Node(i, i == A || i == B));
        }

        int count = 0;

        while(arr1.size() >= 2)
        {
            count++;
            for (int i = 1; i <= arr1.size()/2; i++)
            {
                Node node1 = arr1.get(i*2-1);
                Node node2 = arr1.get(i*2-2);

                if (node1.isSelect() && node2.isSelect())
                {
                    return count;
                }
                arr2.add(new Node(i, node1.isSelect() || node2.isSelect()));
            }
            arr1.clear();
            arr1.addAll(arr2);
            arr2.clear();
        }
        return -1;
    }


    private static void myLog(int N, int A, int B, int answer)
    {
        System.out.println("N : " + N);
        System.out.println("A : " + A);
        System.out.println("B : " + B);
        System.out.println("answer : " + answer);
    }

    static class Node
    {
        int value = 0;
        boolean select = false;

        public Node(int value, boolean select)
        {
            this.value = value;
            this.select = select;
        }

        public int getValue()
        {
            return value;
        }

        public void setValue(int value)
        {
            this.value = value;
        }

        public boolean isSelect()
        {
            return select;
        }

        public void setSelect(boolean select)
        {
            this.select = select;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", select=" + select +
                    '}';
        }
    }
}
