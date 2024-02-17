//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181937?language=java

package LV_0.DAY4;

class Solution {
    public int solution(int num, int n) {
        int answer = 0;

        if (2 <= num && num <= 100 && 2 <= n && n <= 9) {// 길이 제한사항
            if (num % n == 0) { // num을 n으로 나눈 나머지가 0인경우 num은 n의 배수
                answer = 1;
            } else {// 나머지가 0이 아니므로 num은 n의 배수가 아닌 경우
                answer = 0;
            }
        }
        return answer;// 값 반환
    }
}