//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181895

package LV_0.DAY12;

import java.util.LinkedList;

class Solution {
    public LinkedList<Integer> solution(int[] arr, int[] query) {
        LinkedList<Integer> answer = new LinkedList<Integer>();

        for (int i : arr) {
            answer.addLast(i);
        } // answer에 arr값 옮겨담기

        for (int i = 0; i < query.length; i++) {// query길이를 이용한 for문 생성

            if (i % 2 == 0) {// i가 짝수일 때

                answer.subList(query[i] + 1, answer.size()).clear();
                // query[i]값의 인덱스 제외 뒷부분 다 자르기

            } else if (i % 2 == 1) {// i가 홀수일 때

                answer.subList(0, query[i]).clear();//
                // query[i]값의 인덱스 제외 앞부분 다 자르기
            }

        }

        return answer;// 값 반환
    }
}