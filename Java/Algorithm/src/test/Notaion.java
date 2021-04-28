package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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
        int value = scanner.nextInt();
        System.out.println("몇진법?");
        int notaion = scanner.nextInt();

        LinkedList<String> linkedList = new LinkedList<>();
        while (value >= notaion)
        {
            if (notaion == 16)
            {
                int temp = value % notaion;
                if (temp >= 10)
                {
                    temp = temp - 10;
                    linkedList.addFirst(String.valueOf((char)(97+temp)));
                }
            } else {
                linkedList.addFirst(String.valueOf((value % notaion)));
            }
            value = (value / notaion);
        }
        linkedList.addFirst(String.valueOf(value));
        System.out.println(linkedList);
    }
}
