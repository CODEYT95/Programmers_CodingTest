//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181910

package LV_0.DAY9;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(my_string.length() - n); // 전체 길이에서 -n

        return answer;// 값 반환
    }
}
