//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181926

package LV_0.DAY5;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;

        if (-100000 <= n && n <= 100000 && 1 <= control.length() && control.length() <= 100000) { // 길이 제한사항

            for (char idx : control.toCharArray()) { // for-each문 char타입으로 control에 들어있는 문자 하나씩 출력

                if (idx == 'w') { // 문자가 w인경우
                    n += 1; // n에 +1 더해주기

                } else if (idx == 's') { // 문자가 s인경우
                    n += -1;// n에 -1 빼주기

                } else if (idx == 'd') { // 문자가 d인경우
                    n += 10;// n에 +10 더해주기

                } else { // 문자가 a인경우
                    n += -10;// n에 -10 빼주기
                }
            }
            answer = n; // answer에 n의 값 넣기
        }

        return answer;// 값 반환
    }
}