//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181937?language=java

package LV_0.DAY5;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        if (1 <= a && a <= 100 && 1 <= d && d <= 100 && 1 <= included.length && included.length <= 100) {// 길이제한
            for (int i = 1; i <= included.length; i++) {// for문

                if (included[i - 1] == true) { // included가 true면 answer에 a값 더하기
                    answer += a;
                }
                a += d; // 1항에 공차를 더하기
            }
        }
        return answer; // 값 반환
    }
}