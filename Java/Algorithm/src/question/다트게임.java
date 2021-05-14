package question;

public class 다트게임 {
    public static void main(String[] args) {
        System.out.println("다트 게임");

        // 총 3번의 기회
        // 각 기회마다 0점 ~ 10점
        // 영역 싱글 1제곱, 더블 2제곱, 트리플 3제곱
        // 옵션 스타상 현재 점수 ,바로 전 점수를 각 2배   아차상 당첨시 해당점수를 마이너스
        //스타상의 효과는 중첩 가능능

        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));
    }

    public static int solution(String dartResult)
    {
        int [] answer = new int[3];
        int count = -1;

        for (int i = 1; i <= dartResult.length(); i++)
        {
            String split = dartResult.substring(i-1, i);
            if (split.equals("1"))
            {
                String tempValue = dartResult.substring(i-1, i+1);
                if (tempValue.equals("10"))
                {
                    split = tempValue;
                    i++;
                }
            }
            try {
                int temp = Integer.parseInt(split);
                answer[++count] = temp;
                continue;
            }catch (Exception e)
            {

            }

            if (split.equals("S"))
            {
                answer[count] = (int)Math.pow(answer[count], 1);
            }
            else if(split.equals("D"))
            {
                answer[count] = (int)Math.pow(answer[count], 2);
            }
            else if (split.equals("T"))
            {
                answer[count] = (int)Math.pow(answer[count], 3);
            }
            else if (split.equals("*"))
            {
                int prevCount = count - 1;
                if (prevCount >= 0)
                {
                    answer[prevCount] = answer[prevCount] * 2;
                }
                answer[count] = answer[count] * 2;
            }
            else if (split.equals("#"))
            {
                answer[count] = answer[count] * -1;
            }
        }
        return answer[0] + answer[1] + answer[2];
    }
}

