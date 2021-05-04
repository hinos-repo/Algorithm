package question;

public class 키패드누르기
{
    public static void main(String [] args)
    {
        int[] numbers1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(solution(numbers1, "right"));

        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(solution(numbers2, "left"));

        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(solution(numbers3, "right"));
    }

    public static String solution(int[] numbers, String hand)
    {
        String answer = "";
        int [][] phoneNumbers = {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9},
                {-1, 0, -1}
        };
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2
        // 3,0 3,1 3,2
        //

        int [] leftPosition = {3, 0};
        int [] rightPosition = {3, 2};

        int [] leftFix = {1, 4, 7};
        int [] rightFix = {3, 6, 9};

        Loop1: for (int i = 0; i <numbers.length; i++) {
            int leftPos = 0;
            int rightPos = 0;
            for (int a = 0; a < phoneNumbers.length; a++) {
                for (int b = 0; b < phoneNumbers[0].length; b++) {
                    if (phoneNumbers[a][b] == numbers[i]) {
                        leftPos = a;
                        rightPos = b;
                        break;
                    }
                }
            }

            for (int a = 0; a < leftFix.length; a++) {
                if (numbers[i] == leftFix[a]) {
                    leftPosition[0] = leftPos;
                    leftPosition[1] = rightPos;
                    answer += "L";
                    continue Loop1;
                }
            }

            for (int a = 0; a < rightFix.length; a++) {
                if (numbers[i] == rightFix[a]) {
                    rightPosition[0] = leftPos;
                    rightPosition[1] = rightPos;
                    answer += "R";
                    continue Loop1;
                }
            }

            int leftFingerDistance = Math.abs(leftPos-leftPosition[0]) + Math.abs(rightPos-leftPosition[1]);
            int rightFingerDistance = Math.abs(leftPos-rightPosition[0]) + Math.abs(rightPos-rightPosition[1]);

            if (leftFingerDistance - rightFingerDistance == 0)
            {
                if (hand.equals("right"))
                {
                    rightPosition[0] = leftPos;
                    rightPosition[1] = rightPos;
                    answer += "R";
                } else {
                    leftPosition[0] = leftPos;
                    leftPosition[1] = rightPos;
                    answer += "L";
                }
            } else if(leftFingerDistance > rightFingerDistance)
            {
                rightPosition[0] = leftPos;
                rightPosition[1] = rightPos;
                answer += "R";
            }else {
                leftPosition[0] = leftPos;
                leftPosition[1] = rightPos;
                answer += "L";
            }
        }
        return answer;
    }
}
