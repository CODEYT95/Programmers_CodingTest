//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181915

package LV_0.DAY8;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int i : index_list - 1) { // index_list길이 만큼의 for문

            answer += my_string.charAt(index_list[i]);// index_list에 들어있는 숫자를 차례대로 뽑아 그 숫자에 해당하는 my_string의 문자를 answer에
                                                      // 넣기

        }

        return answer;// 값 반환
    }
}