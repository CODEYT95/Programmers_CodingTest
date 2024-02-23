//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181919

package LV_0.DAY7;

class Solution {
    public int[] solution(int x) {
        int[] answer = {};
        int[] arr = new int[1000]; // arr 배열 넉넉하게 준비
        int n = x; // x의 초기값 n에 넣어주기
        int count = 1; // answer의 배열 크기를 정해주기 위해 count변수 생성 0은 x의 초기값을 넣어주기 위해 1부터 시작
        boolean run = true;

        while (run) { // x가 1이 될 때까지 while 실행

            if (x == 1) {// x가 1이되는 경우

                run = false;// while 탈출

            } else {// x가 1이 아닌 경우

                if (x % 2 == 0) {// x가 짝수일 때

                    x = x / 2;
                    arr[count] = x;// arr에 값 넣어주기
                    count++;

                } else {// x가 홀수일 때

                    x = 3 * x + 1;
                    arr[count] = x;// arr에 값 넣어주기
                    count++;

                }
            }

        }

        answer = new int[count];// answer count만큼의 배열 생성
        answer[0] = n; // x의 초기값 answer[0]에 넣어주기

        for (int i = 1; i < count; i++) {// answer에 arr값들 옮겨주기

            answer[i] = arr[i];

        }
        return answer;// 값 반환
    }
}