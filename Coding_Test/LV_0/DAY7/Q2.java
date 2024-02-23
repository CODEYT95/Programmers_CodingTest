//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181921

package LV_0.DAY7;

import java.util.LinkedList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};

        LinkedList<Integer> link = new LinkedList<Integer>();// LinkedList 객체 생성

        for (int i = l; i <= r; i++) {// l이상r이하 for문 생성

            if (Integer.toString(i).matches("^[05]+$")) { // 0과 5로만 이루어 졌을 때

                link.add(i); // 배열에 i의 값 추가

            }
        }

        if (link.isEmpty()) { // 배열이 비었을 경우

            answer = new int[1];

            answer[0] = -1; // 배열이 비었을 때 -1 출력

        } else {// 배열에 값이 있을 경우

            answer = new int[link.size()];

            for (int k = 0; k < link.size(); k++) { // answer로 값 옮기기
                answer[k] = link.get(k);
            }
        }

        return answer;// 값 반환
    }
}