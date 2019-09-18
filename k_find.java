import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] test;	// 임시 배열들을 담아둘 정수형 배열 변수 선언
        int a, b;	// 반복문에 사용할 변수 선언
        int s=0;	// 임시배열 방 번호를 조절하기 위한 변수 선언
        int i, j, k;	// commands 의 원소를 가져와서 담기 위한 변수 선언

	// command 배열의 길이만큼 반복문 수행
        for(a=0 ; a<commands.length ; a++)
        {
            i = commands[a][0];		// commands 의 a 번째 방에 있는 0번째 원소
            j = commands[a][1];		// commands 의 a 번째 방에 있는 1번째 원소
            k = commands[a][2];		// commands 의 a 번째 방에 있는 2번째 원소
            test = new int[j - i +1];	// test 라는 배열 방의 갯수를 추출해오는 배열의 크기만큼 선언
					// (외부 반복문이 수행될 때마다 초기화 됨)

            // System.out.println(i + " " + j + " " + k);
	    // 출력으로 i, j, k 값 확인

	    // array 배열의 i 부터 j 까지 값을 담기위한 반복문 수행
            for(b=i-1 ; b<j ; b++)
            {
                test[s] = array[b];	// test[0]...test[s]에  array[i]부터 array[j]까지 값 가져와서 복사
                s++;
            }
            s=0;

            Arrays.sort(test);	 	// 임시 배열 초기화

            answer[a] = test[k-1];	// answer 에 test에서 k 번째 자리에 있는 수를 넣는다.
        }

        return answer;

    }
}