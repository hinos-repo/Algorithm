package question.level2;

public class 멀쩡한_사각형
{
    public static void main(String[] args)
    {
        int W = 8;
        int H = 12;

        System.out.println(solution(W, H));
    }

    private static long solution(int w, int h)
    {
        long lw = Integer.toUnsignedLong(w);
        long lh = Integer.toUnsignedLong(h);

        long total = lw * lh;
        long cutCount = (w+h) - gcd(w, h);
        return total-cutCount;
    }

    private static long gcd(long a, long b)
    {
        while (b != 0)
        {
            long remain = a % b;
            a = b;
            b = remain;
        }
        return a;
    }
}
