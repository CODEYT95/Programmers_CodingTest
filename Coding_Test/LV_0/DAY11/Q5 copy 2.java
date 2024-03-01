//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181902

package LV_0.DAY11;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        char arr[] = my_string.toCharArray();// my_string을 char타입 배열로 만들기
        answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {// my_string을 이용한 for문 생성

            int ascii = (int) arr[i]; // my_string에 담긴 문자를 숫자(아스키코드)로 만들기

            if (65 <= ascii && ascii <= 90) {// 대문자인 경우

                answer[ascii - 65] += 1;

            } else if (97 <= ascii && ascii <= 122) {// 소문자인 경우

                answer[ascii - 71] += 1;
            }

        }

        return answer; // 값 반환
    }
}
