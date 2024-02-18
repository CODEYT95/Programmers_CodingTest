//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181929

package LV_0.DAY5;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1;
        int square = 0;

        if (2 <= num_list.length && num_list.length <= 10) {// 길이 제한사항

            for (int idx = 0; idx < num_list.length; idx++) { // for문 생성

                if (1 <= num_list[idx] && num_list[idx] <= 9) { // num_list의 원소 제한사항

                    multiply *= num_list[idx]; // 모든 원소들의 곱

                    square += num_list[idx]; // 모든 원소들의 합
                }
                if (multiply < Math.pow(square, 2)) { // 모든 원소들의 곱 < 모든 원소들의 합의 제곱인 경우

                    answer = 1; // 1출력

                } else {// 모든 원소들의 곱 > 모든 원소들의 합의 제곱인 경우

                    answer = 0; // 0출력

                }
            }

        }

        return answer; // 값 반환
    }
}