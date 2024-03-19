//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181886

package LV_0.DAY14;

import java.util.*;

class Solution {
    public LinkedList<String> solution(String[] names) {
        LinkedList<String> answer = new LinkedList<String>();// LikedList 객체 생성

        for (int i = 0; i < names.length; i += 5) {// 5명씩 묶은 그룹의 가장 앞에 서있는 사람 뽑기

            answer.add(names[i]);// answer에 값 넣어주기

        }

        return answer;// 값 반환
    }
}