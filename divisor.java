import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
		  
	      int[] result= new int[arr.length];    // 임시 배열 result 선언 및 arr.length 만큼 방 생성
	      int[] answer;                          // 반환 배열 선언
	      int i, count=0;                        // count : 나누어 떨어지는 수의 개수
	      
	      for(i=0; i<arr.length; i++)
	      {
	          if(arr[i]%divisor == 0)   // 나누어 떨어지는 수 라면
	          {
	              result[count]=arr[i]; // 임시 배열 count 번째 방에 해당 arr 의 배열방의 값을 넣어주고
	              count++;                // count 증가
	          }
	          else
	              continue;
	      }
	      
	      if(count==0)                      // count 가 0 이라면 : 나누어 떨어지는 수가 존재하지 않으면
	      {
	    	  answer = new int[1];          // answer 배열 방의 개수를 1개만 생성
	          answer[0] = -1;               // answer 의 0 번째방에 -1 넣어서 반환
	          return answer;
	      }
	      
	      answer = new int[count];		// 나누어떨어지는 수 만큼의 answer 방 생성
	      
	      if(count!=0)			// 나누어 떨어지는 수가 하나라도 존재하면
	      {
	         for(i=0; i<count; i++)
	         {
	             answer[i] = result[i];	// result 에 있는 수 들을 answer 에 넣어준다
	         } 
	      }      
	      
	      Arrays.sort(answer);
	      
	      return answer;
	  }

}