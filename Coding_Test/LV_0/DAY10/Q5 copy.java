//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181906

package LV_0.DAY10;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {// my_string을 이용해 for문 생성

            if (my_string.substring(0, i + 1).equals(is_prefix)) {// .equals메소드로 문자열 비교

                answer = 1; // 접두사가 맞으면 answer = 1

            }

        }

        return answer;// 값 반환
    }
}