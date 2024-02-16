//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181934

package LV_0.DAY4;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String compare = ineq + eq; // 비교 연산자를 한 문자열에 넣기

        if (1 <= n && n <= 100 && 1 <= m && m <= 100) {// 길이 제한 사항
            if (compare.equals(">=")) {// 비교연산자가 >= 인 경우
                if ((n >= m) == true) {// n과m 비교해서 true인 경우
                    answer = 1;
                } else {// false인 경우
                    answer = 0;
                }
            } else if (compare.equals("<=")) {// 비교연산자가 <= 인 경우
                if ((n <= m) == true) {// n과m 비교해서 true인 경우
                    answer = 1;
                } else {// false인 경우
                    answer = 0;
                }
            } else if (compare.equals(">!")) {// 비교연산자가 >! 인 경우
                if ((n > m) == true) {// n과m 비교해서 true인 경우
                    answer = 1;
                } else {// false인 경우
                    answer = 0;
                }
            } else {// 비교연산자가 <! 인 경우
                if ((n < m) == true) {// n과m 비교해서 true인 경우
                    answer = 1;
                } else {// false인 경우
                    answer = 0;
                }
            }
        }
        return answer;// 값 반환
    }
}