//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181924

package LV_0.DAY6;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];// answer의 배열길이 정해주기

        for (int idx = 0; idx < queries.length; idx++) {// for문 생성

            int temp1 = arr[queries[idx][0]]; // temp1에 arr[idx][0]번째 값 넣어주기
            int temp2 = arr[queries[idx][1]]; // temp2에 arr[idx][1]번째 값 넣어주기

            arr[queries[idx][1]] = temp1;// arr배열에서 queries[idx][1]에 해당하는 위치에 temp1에 저장한 값으로 바꾸기
            arr[queries[idx][0]] = temp2;// arr배열에서 queries[idx][0]에 해당하는 위치에 temp2에 저장한 값으로 바꾸기

            for (int i = 0; i < arr.length; i++) {// for문으로 answer애 arr값 복붙 해주기
                answer[i] = arr[i];
            }
        }

        return answer;// 값 반환
    }
}