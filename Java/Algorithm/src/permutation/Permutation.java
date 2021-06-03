package permutation;


import test.MyUtil;

public class Permutation
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3}; //데이터
        int n = 3; // 데이터 사이즈
        int r = 3; // 찾을 데이터
        int[] output = new int[n]; // 임시배열

        boolean[] visited = new boolean[n]; // 방문 여부

        perm3(arr, output, visited, 0);
    }

    static void perm2(int [] arr, int [] output, boolean[] visited, int depth, int n, int r)
    {
        if (depth == r)
        {
            System.out.println(MyUtil.toString(output));
            return;
        }

        for (int i = 0; i < n; i++)
        {
            if (!visited[i])
            {
                visited[i] = true;
                output[depth] = arr[i];
                perm2(arr, output, visited, depth+1, n, r);
                output[depth] = 0;
                visited[i] = false;
            }
        }
    }

    static void perm3(int [] arr, int [] output, boolean [] visited, int depth)
    {
        if (depth == arr.length)
        {
            System.out.println(MyUtil.toString(output));
            return;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (!visited[i])
            {
                output[depth] = arr[i];
                visited[i] = true;
                perm3(arr, output, visited, depth+1);
                visited[i] = false;
            }
        }
    }

    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r)
    {
        print(output, r);
        if (depth == r)
        {
            return;
        }

        for (int i=0; i<n; i++)
        {
            if (visited[i] != true)
            {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;
            }
        }
    }

    // 배열 출력
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
