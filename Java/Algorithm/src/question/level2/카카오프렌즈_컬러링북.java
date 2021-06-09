package question.level2;

import java.util.ArrayList;


public class 카카오프렌즈_컬러링북
{
    public static void main(String[] args)
    {
        int m = 6;
        int n = 4;

        int [][] picture = new int [][]{
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}
        };

        System.out.println(solution(m, n, picture));

        // 위            (x+1, y)
        // 아래          (x-1, y)
        // 왼쪽          (x, y-1)
        // 오른쪽        (x, y+1)
    }

    static int solution(int m, int n, int [][] picture)
    {
        boolean [][] visited = new boolean[m][n];
        int answer = 0;

        int kinds = 0;
        int large = 0;
        for (int i = 0; i < picture.length; i++)
        {
            for (int j = 0; j < picture[0].length; j++)
            {
                if (picture[i][j] != 0 && !visited[i][j])
                {
                    ArrayList<Node> arr = new ArrayList<>();
                    dfs(i, j, picture[i][j], picture, visited, arr);
                    kinds++;
                    if (large < arr.size())
                    {
                        large = arr.size();
                    }
                }
            }
        }

        System.out.println(kinds);
        System.out.println(large);

        return answer;
    }

    static void dfs(int x, int y, int value, int [][] picture, boolean [][] visited, ArrayList<Node> arr)
    {
        if (x < 0 || y < 0)
        {
            return;
        }
        if (x >= picture.length || y >= picture[0].length)
        {
            return;
        }
        if (visited[x][y])
        {
            return;
        }
        if (value != picture[x][y])
        {
            return;
        }

        visited[x][y] = true;

        dfs(x+1, y, picture[x][y], picture, visited, arr);
        dfs(x-1, y, picture[x][y], picture, visited, arr);
        dfs(x, y+1, picture[x][y], picture, visited, arr);
        dfs(x, y-1, picture[x][y], picture, visited, arr);

        if(value == picture[x][y])
        {
            arr.add(new Node(x, y, picture[x][y]));
        }
    }

    static class Node
    {
        int x;
        int y;
        int value;

        public Node(int x, int y, int value)
        {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}
