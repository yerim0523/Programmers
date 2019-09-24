class Solution {
  public boolean solution(String s) {
      boolean answer = true;
      int i;
      
      for(i=0; i<s.length(); i++)
      {
          if(s.length()!=4 || s.length()!=6)    // s의 길이가 4 또는 6이 아니라면
          {
              answer = false;                   // false 처리
              break;
          }
          else                                    // s 의 길이가 4 또는 6이라면
          {
              if((s.charAt(i)) < (char)48 || (s.charAt(i)) > (char)57)
              {
                  answer = false;
                  break;
              }
          }
      }
      return answer;
  }
}