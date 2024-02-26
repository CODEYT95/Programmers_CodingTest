//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181912

package LV_0.DAY9;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int[] result = new int[10000]; // intStrs의 길이 만큼의 result배열 생성
        int count = 0;

        for (int idx = 0; idx < intStrs.length; idx++) { // intStrs.length만큼의 for문 생성

            if (k < Integer.parseInt(intStrs[idx].substring(s, s + l))) { // k보다 큰 경우

                result[count] = Integer.parseInt(intStrs[idx].substring(s, s + l)); // result에 값 넣어주기
                count += 1;
            }
        }
        answer = new int[count];
        for (int i = 0; i < count; i++) {// 값 옮기기

            answer[i] = result[i];

        }

        return answer;// 값 반환
    }
}