//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181908

package LV_0.DAY9;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {

            if (my_string.substring(my_string.length() - i - 1).equals(is_suffix)) {// .equals메소드로 문자열 비교

                answer = 1; // 접미사가 맞으면 answer = 1

            }

        }

        return answer;// 값 반환
    }
}