//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181889

package LV_0.DAY13;

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {

        return Arrays.copyOfRange(num_list, 0, n); // Arrays.copyOfRange()로 n번째 원소까지~
    }
}