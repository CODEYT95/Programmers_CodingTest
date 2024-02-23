//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181927

package LV_0.DAY7;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        if (2 <= num_list.length && num_list.length <= 10) { // 길이 제한사항

            answer = new int[num_list.length + 1]; // num_list 보다 길이가 1 더 긴 int answer 배열 만들기

            for (int idx = 0; idx < num_list.length; idx++) {// for문 이용해서 answer배열에 num_list 배열 옮기기

                answer[idx] = num_list[idx];
            }
            if (answer[answer.length - 2] > answer[answer.length - 3]) {// 마지막 원소가 그전 원소보다 큰 경우

                answer[answer.length - 1] = answer[answer.length - 2] - answer[answer.length - 3];

            } else {// 마지막 원소가 그전 원소보다 작은 경우

                answer[answer.length - 1] = answer[answer.length - 2] * 2;
            }
        }

        return answer; // 값 반환
    }
}