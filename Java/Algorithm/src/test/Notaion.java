package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Notaion
{

    public static void main(String [] args)
    {
//        System.out.println(0xff);
//        System.out.println(1^0xff);
//        System.out.println(2^0xff);
//        System.out.println(3^0xff);
//        System.out.println(0xBC^0xff);
//        System.out.println(0x67);

        Scanner scanner = new Scanner(System.in);
        System.out.println("값 입력");
        int sample = scanner.nextInt();
        System.out.println("몇진법?");
        int notaion = scanner.nextInt();

        ArrayList<String> test = new ArrayList<>();
        while (sample >= notaion)
        {
            if (notaion == 16)
            {
                int temp = sample % notaion;
                if (temp >= 10)
                {
                    temp = temp - 10;
                    test.add(String.valueOf((char)(97+temp)));
                }
            } else {
                test.add(String.valueOf((sample % notaion)));
            }
            sample = (sample / notaion);
        }
        test.add(String.valueOf(sample));
        Collections.reverse(test);
        System.out.println(test);
    }
}
