//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181923
package LV_0.DAY6;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];

        for (int idx = 0; idx < queries.length; idx++) { // queries의 값들을 차례대로 s,e,k에 저장
            int s = queries[idx][0];
            int e = queries[idx][1];
            int k = queries[idx][2];
            int minVal = 1000000;

            for (int i = s; i <= e; i++) { // s ≤ i ≤ e 로 arr배열의 범위 설정

                if (k < arr[i] && arr[i] < minVal) {// arr[i]가 k보다 크면서 범위 중 가장 작은 값

                    minVal = arr[i];
                    answer[idx] = minVal;

                }

            }
            if (minVal == 1000000) {
                answer[idx] = -1;
            }

        }

        return answer; // 값 반환
    }
}