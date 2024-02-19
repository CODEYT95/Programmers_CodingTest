//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181928

package LV_0.DAY5;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        if (2 <= num_list.length && num_list.length <= 10) {// 길이 제한사항

            for (int idx : num_list)// for-each문

                if (1 <= idx && idx <= 9) {// 원소 범위 제한사항

                    if (idx % 2 == 1) { // 홀수일 때
                        odd += Integer.toString(idx);

                    } else {// 짝수일 때
                        even += Integer.toString(idx);
                    }
                }
            answer = Integer.parseInt(odd) + Integer.parseInt(even); // String타입을 int타입으로 변환 후 값 더 해서 출력
        }

        return answer;
    }
}