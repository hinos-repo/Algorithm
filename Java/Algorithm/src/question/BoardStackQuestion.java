package question;

import java.util.Stack;

public class BoardStackQuestion
{
    public static void main(String [] args)
    {
        int answer = 0;

        int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] moves = {1,5,3,5,1,2,1,4};

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < moves.length; i++)
        {
            int row = moves[i]-1;
            for(int j = 0; j < board.length; j++)
            {
                int value = board[j][row];
                if(value == 0)
                {
                    continue;
                }
                if (stack.isEmpty())
                {
                    stack.push(value);
                } else {
                    if (stack.peek() == value)
                    {
                        stack.pop();
                        answer+=2;
                    } else {
                        stack.push(value);
                    }
                }
                board[j][row] = 0;
                break;
            }
        }

        System.out.println(stack);

        System.out.println(answer);
    }
}
