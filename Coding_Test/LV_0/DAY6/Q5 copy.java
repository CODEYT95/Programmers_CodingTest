//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181928

package LV_0.DAY5;

class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for (int idx = 1; idx < numLog.length; idx++) {

            if (numLog[idx] - numLog[idx - 1] == 1) { // 1인경우

                answer += "w";

            } else if (numLog[idx] - numLog[idx - 1] == -1) { // -1인경우

                answer += "s";

            } else if (numLog[idx] - numLog[idx - 1] == 10) { // 10인경우

                answer += "d";

            } else if (numLog[idx] - numLog[idx - 1] == -10) { // -10인경우

                answer += "a";

            }

        }
        return answer; // 값 반환
    }
}