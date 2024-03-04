//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181898

package LV_0.DAY12;

class Solution {
    public int solution(int[] num_list) {
        int answer = -1; // 음수가 없으면 -1 그대로 출력

        for (int i = 0; i < num_list.length; i++) {// num_list길이를 이용한 for문 생성

            if (num_list[i] < 0) {// num_list[i] 값이 음수일 때

                answer = i; // answer에 해당 인덱스 넣기

                break;// 음수일 경우를 찾으면 for문 바로 종료

            }

        }

        return answer;// 값 반환
    }
}