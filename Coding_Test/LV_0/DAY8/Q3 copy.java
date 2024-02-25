//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181913
package LV_0.DAY8;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char temp1; // 임시로 값 옮겨둘 곳1
        char temp2; // 임시로 값 옮겨둘 곳2
        char arr[] = my_string.toCharArray(); // my_string 배열로 만들기

        for (int i = 0; i < queries.length; i++) {// s,e값 for문으로 만들기

            int s = queries[i][0];
            int e = queries[i][1];

            for (int k = s; s < e; k++) {

                if (k < e) {// e가k보다 클 때

                    // 임시로 값 저장
                    temp1 = arr[k];
                    temp2 = arr[e];

                    // 값 서로 바꿔주기
                    arr[k] = temp2;
                    arr[e] = temp1;

                }

                e--;
            }
        }
        for (char i : arr) {// 값 옮겨주기

            answer += i;
        }

        return answer;
    }
}