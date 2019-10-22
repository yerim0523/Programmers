class Solution {
  public String solution(String s) {
      String result = s;
		int i, j;

		char[] temp1 = result.toCharArray();    // result(문자열) 을 문자형으로 하나씩 담기 위한 문자형 배열 변수 선언

		char temp;                                 // 자리 바꾸기를 위한 변수 선언

		for(i=0; i<temp1.length; i++)
		{
			for(j=i; j<temp1.length; j++)
			{
				if(temp1[i]<temp1[j])              // 본인보다 큰 배열을 찾으면 자리 바꾸기(문자형끼리 비교할 수 있다.)
				{
					temp = temp1[j];
					temp1[j] = temp1[i];
					temp1[i] = temp;
				}
			}
		}

		String answer = new String(temp1);         // 문자형을 다시 문자열로 형변환시켜준 뒤에 answer 에 담는다.

		return answer;
  }
}