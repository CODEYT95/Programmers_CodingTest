//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181922

package LV_0.DAY7;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];

        for (int idx = 0; idx < queries.length; idx++) { // queries의 값들을 차례대로 s,e,k에 저장

            int s = queries[idx][0];
            int e = queries[idx][1];
            int k = queries[idx][2];

            for (int i = s; i <= e; i++) { // s ≤ i ≤ e 로 arr배열의 범위 설정

                if (i == 0 || i % k == 0) { // i가 0인 경우 or i가 k의 배수인 경우

                    arr[i] += 1;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {// answer에 값 옮겨주기
            answer[i] = arr[i];
        }

        return answer;// 값 반환
    }

}