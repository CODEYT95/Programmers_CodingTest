//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181909

package LV_0.DAY9;

import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = new String[my_string.length()]; // answer 배열 길이 정해주기

        for (int i = 0; i < my_string.length(); i++) { // my_string길이를 이용한 for문 생성

            answer[i] = my_string.substring(my_string.length() - i - 1); // 뒤에서부터 하나씩 늘려가며 문자 자르기, -1을 해줘서 첫 값이 공백이 안나오게
                                                                         // 하기

        }

        Arrays.sort(answer);// 사전순으로 정렬

        return answer;
    }
}