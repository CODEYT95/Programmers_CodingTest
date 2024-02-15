//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181935?language=java

package LV_0.DAY4;

class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n % 2 != 0) {// n이 홀수일 때

            for (int i = 1; i <= n; i++) {

                if (i % 2 != 0) {
                    answer += i;
                }

            }

        } else {// n이 짝수일 때

            for (int i = 1; i <= n; i++) {

                if (i % 2 == 0) {
                    answer += i * i;
                }

            }

        }

        return answer;
    }
}