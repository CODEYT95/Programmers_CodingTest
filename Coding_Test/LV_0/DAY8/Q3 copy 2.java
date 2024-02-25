//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181914

package LV_0.DAY8;

class Solution {
    public int solution(String number) {
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {

            answer += Integer.parseInt(String.valueOf(number.charAt(i)));

        }
        return answer % 9;
    }
}