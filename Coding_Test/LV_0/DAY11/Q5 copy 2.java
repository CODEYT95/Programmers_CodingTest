//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181903

package LV_0.DAY10;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char arr[] = code.toCharArray();// char타입 배열에 code넣기

        for (int idx = 0; idx < code.length(); idx++) {// code길이를 이용한 for문 생성

            if (idx % q == r) { // 인덱스를 q로 나눈 나머지가 r인 경우

                answer += arr[idx]; // answer에 값 넣기

            }

        }

        return answer;// 값 반환
    }
}