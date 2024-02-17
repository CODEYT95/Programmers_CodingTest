//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181930

package LV_0.DAY5;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (1 <= a && a <= 6 && 1 <= b && b <= 6 && 1 <= b && b <= 6) {// 길이 제한사항
            if (a == b && b == c && a == c) {// a,b,c 다 같을 때
                // answer (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 ) 계산해서 넣기
                answer = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                        * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));

            } else if (a != b && b != c && a != c) {// a,b,c 다 다를 때
                // answer a + b + c 계산해서 넣기
                answer = a + b + c;

            } else {// 두 개만 같고 하나는 틀릴 때
                    // answer (a + b + c) × (a2 + b2 + c2 ) 계산해서 넣기
                answer = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
            }
        }
        return answer;
    }
}