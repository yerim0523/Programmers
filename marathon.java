import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int cnt = 0 ;           // 동명이인 탐색하기 위한 카운트 변수
        int i, j;
        
        // 참가자 명단을 담아둘 해시맵 pmap 선언
        HashMap<Integer , String> pmap = new HashMap<Integer , String>();
        
        // pmap 에 참가자 명단 데이터 값을 넣어준다.
        //   key = 번호 , value = 참가자 이름
        for(i=0; i<participant.length; i++)
            pmap.put(i,participant[i]);
        
        // 완주자 명단을 담아둘 해시맵 pmap 선언
        HashMap<Integer , String> cmap = new HashMap<Integer , String>();
        
        // cmap 에 참가자 명단 데이터 값을 넣어준다.
        //   key = 번호 , value = 완주자 이름
        for(i=0; i<completion.length; i++)
            cmap.put(i,completion[i]);
        
        for(i=0; i<pmap.size(); i++)
        {
            for(j=0; j<cmap.size(); j++)
            {
                // 참가자와 완주자 둘 다 이름이 존재한 경우, 완주한 사람인 경우
                if(pmap.get(i).equals(cmap.get(j)))
                    cnt++;
            }
            // cnt 가 0 인 경우 : 완주를 못한 참가자를 찾은 경우
            if(cnt == 0)
                answer = pmap.get(i);   // answer 에 현재 완주 못한 참가자 이름 넣고
            cnt = 0;                     // 완주를 못한 사람을 찾았기 때문에 cnt=0 만들어줌.
        }
        return answer;
    }
}