//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181901

package LV_0.DAY11;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int idx = 0;// answer의 인덱스로 활용
        answer = new int[n / k];// n을 k로 나눈 값을 answer의 길이로 설정

        for (int i = k; i <= n; i += k) {// n이하의 k배수 for문 생성

            answer[idx] = i; // answer에 값 넣기
            idx++;

        }

        return answer; // 값 반환
    }
}