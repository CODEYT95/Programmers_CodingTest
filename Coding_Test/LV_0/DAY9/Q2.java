//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181911

package LV_0.DAY9;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < parts.length; i++) {// for문으로 parts 값 뽑기

            int s = parts[i][0];
            int e = parts[i][1];

            answer += my_strings[i].substring(s, e + 1); // answer에 값 넣어주기

        }

        return answer;// 값 반환
    }
}
