package factorial;

public class Factorial
{
    public static void main(String [] args)
    {
        /**
         * value 5
         * factorial 5 4 3 2 1 = 120
         * factorial 1 2 3 4 5 = 120
         * */
        System.out.println(loopFactorial(5));
        System.out.println(forLoopFactorial(5));
        System.out.println(recursionFactorial(5));
    }

    static int loopFactorial(int value)
    {
        int result = value;
        do {
            result = result * (--value);
        } while (value > 1);
        return result;
    }

    static int forLoopFactorial(int value)
    {
        int result = 1;
        for (int i = 1; i <= value; i++)
        {
            result *= i;
        }
        return result;
    }

    static int recursionFactorial(int value)
    {
        return value == 1 ? 1 : value * recursionFactorial(value-1);
    }
}
