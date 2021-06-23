package question.level2;

import test.MyUtil;

import java.util.ArrayList;

public class 영어끝말잇기
{
    public static void main(String[] args)
    {

        int n = 2;
        String [] words = {
                "hello", "one", "even", "never", "now", "world", "draw"
        };

        System.out.println(MyUtil.toString(solution(n, words)));
    }

    static int [] solution(int n, String[] words)
    {
        ArrayList<Gamer> arr = new ArrayList<>(n);
        for (int i = 1; i <= n; i++)
        {
            arr.add(new Gamer(i));
        }

        for (int i = 0; i < words.length; i++)
        {
            int index = i % n;

            if (!(i == 0))
            {
                if (!words[i-1].substring(words[i-1].length()-1).equals(words[i].substring(0, 1)))
                {
                    return new int[]{arr.get(index).name, arr.get(index).word.size()+1};
                }
            }

            if (hasValue(arr, words[i]))
            {
                return new int[]{arr.get(index).name, arr.get(index).word.size()+1};
            }
            arr.get(index).word.add(words[i]);
        }
        return new int[]{0, 0};
    }

    static boolean hasValue(ArrayList<Gamer> arr, String word)
    {
        for (Gamer gamer : arr)
        {
            if (gamer.word.contains(word))
            {
                return true;
            }
        }
        return false;
    }

    static class Gamer
    {
        int name = 0;
        ArrayList<String> word = new ArrayList<>();

        public Gamer(int name)
        {
            this.name = name;
        }
    }
}
