//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181894

package LV_0.DAY12;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {// 처음 나오는 2 인덱스 구하기

            if (arr[i] == 2) {
                start = i;
                break;
            }

        }
        for (int i = arr.length - 1; i > -1; i--) {// 마지막에 나오는 2 인덱스 구하기

            if (arr[i] == 2) {
                end = i;
                break;
            }

        }
        // 값 넣기
        if (end != 0) {
            answer = Arrays.copyOfRange(arr, start, end + 1);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}