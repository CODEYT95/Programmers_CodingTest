//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181933?language=java

package LV_0.DAY4;

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (-1000 <= a && a <= 1000 && -1000 <= b && b <= 1000) {

            if (flag == true) {
                answer = a + b;
            } else {
                answer = a - b;
            }
        }

        return answer;
    }
}