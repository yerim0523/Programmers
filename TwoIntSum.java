class Solution {
  public long solution(int a, int b) {
      long answer = 0;

      int i;
     
      // a 보다 b 가 더 큰 경우
      if(a<b)
      {
           for(i=a ; i<=b ; i++) // 작은 수에서 큰수까지 반복문 수행
               answer += i;	 // 작은수에서 큰수까지 누적합
      }
      
      // b 보다 a 가 더 큰 경우
      if(a>b)
      {
          for(i=b ; i<=a ; i++)	// 작은 수에서 큰수까지 반복문 수행
              answer += i;	// 작은수에서 큰수까지 누적합
      }
      
      // a 와 b 가 같은 경우
      if(a==b)
	  answer = a;	// 두 수중 하나만 리턴하기 위해

      return answer;
  }
}