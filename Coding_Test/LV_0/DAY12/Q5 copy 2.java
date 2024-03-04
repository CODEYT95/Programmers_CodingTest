//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181898

package LV_0.DAY11;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = 0; i < arr.length; i++) { // arr의 길이를 이용한 for문 생성

            if (i >= idx && arr[i] == 1) { // i가 idx보다 크거나 같으면서 1인 가장 작은 인덱스

                answer = i;// 가장 작은 인덱스를 찾아야 하므로 1을 찾으면 break를 써서 for문 종료
                break;
            }

        }

        return answer;// 값 반환
    }
}