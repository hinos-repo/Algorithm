package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 오픈채팅방
{
    public static void main(String[] args) {
        String [] record = new String[] {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        solution(record);
    }

    static String [] solution(String [] record)
    {
        HashMap<String, String> hashMap = new HashMap<>(); //uid로 아이디 저장할거임
        ArrayList<String> result = new ArrayList<String>(record.length);
        for (String s : record)
        {
            String[] seperate = s.split(" ");
            String action = seperate[0];
            String uid = seperate[1];

            switch (action)
            {
                case "Enter":
                    hashMap.put(uid, seperate[2]);
                    result.add(uid +" Enter");
                    break;
                case "Leave":
                    result.add(uid +" Leave");
                    break;
                case "Change":
                    hashMap.put(uid, seperate[2]);
                    break;
            }
        }

        String [] answer = new String[result.size()];
        String temp1 = "님이 들어왔습니다.";
        String temp2 = "님이 나갔습니다.";
        int i = 0;

        StringBuilder builder;
        for (String log : result)
        {
            builder = new StringBuilder();

            String[] logSplit = log.split(" ");
            String uid = logSplit[0];
            String action = logSplit[1];

            builder.append(hashMap.get(uid));
            builder.append((action.equals("Enter")) ? temp1 : temp2);

            answer[i++] = builder.toString();
        }
        return answer;
    }
}
