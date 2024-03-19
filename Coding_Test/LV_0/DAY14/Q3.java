//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181885

package LV_0.DAY14;

import java.util.*;

class Solution {
    public List<String> solution(String[] todo_list, boolean[] finished) {

        List<String> answer = new ArrayList<String>();// ArrayList 객체 생성

        for (int i = 0; i < finished.length; i++) {// finished길이를 이용한 for문 생성

            if (finished[i] == false) {// false일 때

                answer.add(todo_list[i]);// answer에 값 넣어주기
            }
        }

        return answer;// 값 반환
    }
}