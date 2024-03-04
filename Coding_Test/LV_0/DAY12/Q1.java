//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181897

package LV_0.DAY12;

import java.util.LinkedList;

class Solution {
    public LinkedList<Integer> solution(int n, int[] slicer, int[] num_list) {

        LinkedList<Integer> answer = new LinkedList<Integer>();// LinkedList 객체 생성

        if (n == 1) {// n이 1일 때

            for (int i = 0; i <= slicer[1]; i++) {// 0번 인덱스부터 slicer[1]번 인덱스까지

                answer.addLast(num_list[i]); // answer에 값 추가

            }

        } else if (n == 2) {// n이 2일 때

            for (int i = slicer[0]; i < num_list.length; i++) {// slicer[0]번 인덱스부터 마지막 인덱스까지

                answer.addLast(num_list[i]); // answer에 값 추가

            }

        } else if (n == 3) {// n이 3일 때

            for (int i = slicer[0]; i <= slicer[1]; i++) {// slicer[0]번 인덱스부터 slicer[1]번 인덱스까지

                answer.addLast(num_list[i]); // answer에 값 추가

            }

        } else {// n이 4일 때

            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {// slicer[0]번 인덱스부터 slicer[1]번 인덱스까지 slicer[2] 간격으로

                answer.addLast(num_list[i]); // answer에 값 추가

            }

        }

        return answer;// 값 반환
    }
}