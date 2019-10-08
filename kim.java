
class Solution {
  public String solution(String[] seoul) {
      
      String answer="";					// answer 초기화
      int i;
      
      for(i=0; i<seoul.length; i++)			// seoul 배열 크기만큼 반복문 수행
      {
          if(seoul[i].equals("Kim"))			// 반복문 돌리다가 Kim 이라는 데이터와 일치하는 배열방을 찾으면
          {
              answer = "김서방은 " +i+ "에 있다";	// 해당 방 번호가 i 이기 때문에 i 에 있다는 문자열 answer 에 넣어준다.
              break;					// 반복문 종료
          }
      }
      return answer;
  }
}