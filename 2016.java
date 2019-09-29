import java.util.Date;

class Solution {
  public String solution(int a, int b) {
      Date d = new Date();		// Date 객체 생성
      
      String answer;

      // 요일 배열 선언 ( 0-일요일, 1-월요일 ... 6-토요일)
      String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
      
      // setYear(), setMonth(), setDate() 날짜 세팅
      d.setYear(2016); 	// 2016 년 기준이므로 2016 넣어서 년도 세팅
      d.setMonth(a-1);	// Month 는 0~11월로 받아들이기 때문에 매개변수로 받은 a 에서 -1 시켜준다.
      d.setDate(b);		// Date 는 1일 부터 31일 사이의 값을 넣어주면 일수로 세팅됨.
      
      answer = week[d.getDay()-1];	// answer = week[d.getDay()]; 라고 입력했을 경우, 요일이 하나씩 미뤄짐.
      
      return answer;
  }
}