import java.util.Arrays;

class Solution {
   
   public int[] solution(int[] answers) {
      int[] supo= new int[3];                           // 수포자들의 점수를 담기 위한 배열
        int[] one = {1, 2, 3, 4, 5};                    // 1번 수포자 정답지
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};           // 2번 수포자 정답지
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};   // 3번 수포자 정답지
       
        int[] answer;                                   // 최종 return 될 answer 배열
        int i;
        int o=0, t=0, h=0;                              // 수포자들의 정답지 배열을 조정할 변수들
        int cnt=0;                                      // 가장 높은 점수를 받은 사람이 여럿일 경우 인원 수 카운트
        
        for(i=0; i<answers.length; i++)
        {
            // 1번 수포자가 푸는 방식
           
           if(one[o]==answers[i]) 
               supo[0]++;
               // 1번 수포자 - 맞으면 정답 갯수 1 증가
            
            o++;        // 1번 수포자 비교배열 방의 숫자 1 증가
            
            if(o==5)    // 1번 수포자의 정답배열이 한 바퀴 돌면
                o=0;    // 0번째 방(1) 으로 초기화
            
            // 2번 수포자가 푸는 방식
            if(two[t]==answers[i])  // 2번 수포자 - 맞으면 정답 갯수 1 증가
                supo[1]++;
            
            t++;
            
            if(t==8)    // 2번 수포자의 정답배열이 한 바퀴 돌면
                t=0;
            
            // 3번 수포자가 푸는 방식
            if(three[h]==answers[i])  // 2번 수포자 - 맞으면 정답 갯수 1 증가
                supo[2]++;
            
            h++;
            
            if(h==10)    // 2번 수포자의 정답배열이 한 바퀴 돌면
                h=0;
        }
   
        int max = 0;                        // 가장 큰 점수를 담을 변수 선언 - 0점으로 초기화 
        for(i=0; i<supo.length; i++) {     // 수포자들의 점수가 담긴 배열을 돌면서
           if(supo[i] > max) {              // 가장큰점수(max) 보다 i 번째 수포자의 점수가 더 크다면
              max = supo[i];                // max 에 i 번째 수포자 점수 담음.
           }
        }
        
        for(i=0; i<supo.length; i++) {      // 수포자들의 점수가 담긴 배열을 돌면서
           if(supo[i] == max) {             // 가장 큰 점수와 같은 점수의 수포자를 찾으면
              cnt++;                        // cnt 인원수 증가(가장 높은 점수 받은 사람 총 인원 수)
           }
        }
        
        answer = new int[cnt];              // 가장 높은 점수를 가진 수포자 만큼 배열 방 생성 
       
        int newcnt=0;                       // 가장 높은 점수를 가진 인원수를 기준으로 answer 에 수포자 번호를 담을 때
                                             // 비교를 위한 변수 선언
        
        for(i=0; i<supo.length; i++) {      // 수포자의 배열만큼 반복문 수행
           if(supo[i] == max) {             // 수포자들의 점수중에 가장 큰 점수가 있으면
              answer[newcnt] = i+1;         // 해당 번호의 수포자를 answer 배열에 넣어준다.
              newcnt++;                     // 2명 이상일 수 있기 때문에 newcnt 변수 1 증가
              
              if(newcnt==cnt)               // 가장 높은 점수를 가진 인원수와, newcnt 가 같으면 반복문 종료
                 break;
           }
        }
        
        Arrays.sort(answer);                // answer 배열 오름차순 정렬
       return answer;
   }

}