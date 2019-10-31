#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num) {
    int answer = 0;
    int count = 0;		// 몇 번 반복하는지 체크하기 위한 변수
    
    while(num!=1)
    {
        if(num%2==0)		// 짝수
        {
            num = num / 2;	// 2로 나눈 값을 다시 num에 넣어줌.
            count ++;		// 반복 횟수 1 증가
        }    
        else if(num%2==1)	// 홀수
        {
            num = (num*3) + 1;
            count++;
        }
        else			// 짝수도 홀수도 아닌 경우(만약을 위해 처리해줘야 함.)
        {
            answer = -1;
            break;
        }
        
        if(count==500)		// 반복문을 500번 돌려도 1이 나오지 않는 경우
        {
            answer = -1;	// -1 을 반환
            break;
        }
        answer = count;		// 반환해야 하는 변수에 현재까지 반복 횟수 넣어줌.
    }
    
    return answer;
}