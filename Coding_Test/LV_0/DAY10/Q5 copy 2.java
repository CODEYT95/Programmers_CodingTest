//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181907

package LV_0.DAY10;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(0, n);// 0번째부터 n번째까지의 문자 answer에 넣기

        return answer;// 값 반환
    }
}