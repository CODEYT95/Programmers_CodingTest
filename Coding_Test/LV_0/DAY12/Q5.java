//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181898

package LV_0.DAY12;

import java.util.LinkedList;

class Solution {
    public LinkedList<Integer> solution(int[] arr, int[][] intervals) {
        LinkedList<Integer> answer = new LinkedList<Integer>();

        for (int i = 0; i < intervals.length; i++) {// intervals길이를 이용한 for문 생성

            int s = intervals[i][0]; // 시작 값
            int e = intervals[i][1]; // 끝 값

            for (int j = s; j <= e; j++) {// 양끝값의 사이의 값을 이용한 for문 생성

                answer.addLast(arr[j]);// answer에 값 넣어주기

            }
        }

        return answer;
    }
}