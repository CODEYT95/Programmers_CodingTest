//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181899

package LV_0.DAY11;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int k = 0;

        for (int i = start; i > end_num - 1; i--) {

            answer[k] = i;
            k++;

        }

        return answer;
    }
}