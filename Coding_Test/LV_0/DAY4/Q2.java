//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181936

package LV_0.DAY4;

class Solution {
    public int solution(int number, int n, int m) {

        int answer = 0;

        if (10 <= number && number <= 100 && 2 <= n && n <= 10) {
            if (number % n == 0 && number % m == 0) {
                answer = 1;
            } else {
                answer = 0;
            }
        }

        return answer; 
    }
}