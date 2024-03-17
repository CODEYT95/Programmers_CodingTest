//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181891

package LV_0.DAY13;

import java.util.LinkedList;

class Solution {
    public LinkedList<Integer> solution(int[] num_list, int n) {
        LinkedList<Integer> answer = new LinkedList<Integer>();

        for (int i = n; i < num_list.length; i++) {// num_list[n]이후의 원소들

            answer.addLast(num_list[i]);
        }

        for (int i = 0; i < n; i++) {// num_list[n]이전의 원소들

            answer.addLast(num_list[i]);

        }

        return answer; // 값 반환
    }
}
