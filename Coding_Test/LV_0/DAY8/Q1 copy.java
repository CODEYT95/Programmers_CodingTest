//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181916

package LV_0.DAY8;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0;
        int q = 0;
        int r = 0;

        if (a == b && b == c && c == d) {
            // 4개가 다 같을 때

            p = a;
            answer = 1111 * p;

        } else if (a == b && b == c || a == b && b == d || a == d && d == c || b == c && c == d) {
            // 3개가 같고 1개는 다를 때

            if (a == b && b == c) {
                answer = (10 * a + d) * (10 * a + d);
            } else if (a == b && b == d) {
                answer = (10 * a + c) * (10 * a + c);
            } else if (a == d && d == c) {
                answer = (10 * a + b) * (10 * a + b);
            } else if (b == c && c == d) {
                answer = (10 * c + a) * (10 * c + a);
            }

        } else if ((a == b && c == d) || (a == c && b == d) || (a == d && c == b)) {
            // 두 개씩 같을 때
            if (a == b && c == d) {
                answer = (a + c) * Math.abs(a - c);
            } else if (a == c && b == d) {
                answer = (a + b) * Math.abs(a - b);
            } else if (a == d && c == b) {
                answer = (a + c) * Math.abs(a - c);
            }

        } else if ((a == b && c != d) || (a == c && b != d) || (a == d && c != b) || (b == c && a != d)
                || (b == d && a != c) || (c == d && a != b)) {
            // 두 개는 같고 두 개가 서로 다를 때
            if (a == b && c != d) {
                answer = c * d;
            } else if (a == c && b != d) {
                answer = b * d;
            } else if (a == d && c != b) {
                answer = c * b;
            } else if (b == c && a != d) {
                answer = a * d;
            } else if (b == d && a != c) {
                answer = c * a;
            } else if (c == d && a != b) {
                answer = a * b;
            }
        } else if (a != b && a != c && a != d && b != c && b != d && c != d) {
            // 모두 다를 때

            answer = a;

            if (b < answer) {
                answer = b;
            }

            if (c < answer) {
                answer = c;
            }

            if (d < answer) {
                answer = d;
            }

        }

        return answer;
    }
}
