//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181888

package LV_0.DAY13;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int count = 0;

        for (int i = 0; i < num_list.length; i += n) {// num_list길이를 이용한 for문 생성

            count++;// answer길이 count에 저장
        }

        answer = new int[count];// answer 길이 생성
        for (int i = 0; i < answer.length; i++) {//// answer길이를 이용한 for문 생성

            answer[i] = num_list[n * i]; // answer에 값 넣어주기

        }
        return answer;// 값 반환
    }
}