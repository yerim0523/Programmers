class Solution {
  public String solution(String s) {
      String answer = "";
      
      if(s.length()%2==1)   // 자리수가 홀수라면 (1,3,5,7,9)
          answer = s.substring(s.length()/2, s.length()/2 + 1);
      else                  // 자리수가 짝수라면 (2,4,6,8,10)
          answer = s.substring(s.length()/2 - 1, s.length()/2 +1);
    
      
      return answer;
  }
  
  /*
  public static void main(String[] args)
  {
      Solution s = new Solution();
      
      String result1 = s.solution("abcde");
      
      String result2 = s.solution("qwer");
  }
  */
}
