//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181918

package LV_0.DAY7;

import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr) {

        LinkedList<Integer> stk = new LinkedList<Integer>(); // LinkedList 객체 생성

        for (int i = 0; i < arr.length;) {// 0~arr.length-1까지 for문 생성

            if (stk.isEmpty()) { // 처음 stk가 빈 배열일 때

                stk.addLast(arr[i]); // 값 추가
                i++; // i +1하기

            } else { // stk에 원소가 있을 때

                if (stk.getLast() < arr[i]) { // stk의 마지막 원소가 arr[i] 보다 작을 때

                    stk.addLast(arr[i]);// 값 추가
                    i++; // i +1하기

                } else {// stk의 마지막 원소가 arr[i] 보다 클 때

                    stk.removeLast();// stk 마지막 원소 제거

                }
            }
        }

        int[] answer = new int[stk.size()]; // answer에 값 옮겨주기
        for (int i = 0; i < stk.size(); i++) {

            answer[i] = stk.get(i);

        }

        return answer; // 값 반환
    }
}