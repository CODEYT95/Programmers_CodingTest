//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181904

package LV_0.DAY10;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {// my_string길이를 이용한 i+=m for문 생성

            if (m == 1) { // m이 1일 때

                answer = my_string; // answer에 my_string값 그대로 넣어주기

            } else {// m이 1이 아닐 때

                answer += my_string.charAt(i); // 해당하는 문자 answer에 넣어주기

            }
        }

        return answer;// 값 반환
    }
}