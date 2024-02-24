//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181917

package LV_0.DAY8;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;

        if ((x1 || x2) && (x3 || x4) == true) {// ∨는 하나가 true면 true
                                               // ∧는 둘 다 true여야지 true

        } else {

            answer = false;

        }

        return answer;// 값 반환
    }
}
