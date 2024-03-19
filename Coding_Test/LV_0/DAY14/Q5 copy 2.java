//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181887

package LV_0.DAY14;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;// 홀
        int even = 0;// 짝

        for (int i = 0; i < num_list.length; i++) {// num_list길이를 이용한 for문

            if ((i + 1) % 2 == 0) {// 홀수

                odd += num_list[i];

            } else {// 짝수

                even += num_list[i];

            }

        }
        if (odd > even) {// 홀수가 클 때
            answer = odd;
        } else { // 짝수가 크거나 같을 때
            answer = even;
        }

        return answer;// 값 반환
    }
}